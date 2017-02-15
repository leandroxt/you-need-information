(() => {
  // Fill table with data
  fetch('/history/percentageVariation')
  .then(data => data.json())
  .then(data => {
    let table = document.getElementById('tblHistory').getElementsByTagName('tbody')[0];
    data.dateAmounts.map((dateValue, i) => {
      let row = table.insertRow(i);
      let date = row.insertCell(0);
      let amou = row.insertCell(1);
      let perc = row.insertCell(2);

      date.appendChild(document.createTextNode(formatDate(new Date(dateValue.epoch))));
      amou.appendChild(document.createTextNode(dateValue.amount));
      perc.appendChild(document.createTextNode(dateValue.percentageVariation));
      total = total + dateValue.amount;
    });
    document.getElementById('total').innerHTML = data.totalPercentageVariation;
    mountPieChart(data.amountVariation);
    mountLineChart(data.dateAmounts);
  });

})();

function mountLineChart(json) {
  let labels = [];
  let data = [];

  json.map(dateValue => {
    labels.push(formatDate(new Date(dateValue.epoch)));
    data.push(dateValue.amount);
  });

  // Mount line chart
  let ctx = document.getElementById('linechart').getContext('2d');
  let lineChart = new Chart(ctx, {
    type: 'line',
    data: {
      labels: labels,
      datasets: [{
        fill: false,
        lineTension: 0,
        label: '$',
        data: data,
        backgroundColor: '#2ECC71',
      },
      ],
    },
  });
}

function mountPieChart(json) {
  let context = document.getElementById('piechart').getContext('2d');
  let pieChart = new Chart(context, {
    type: 'doughnut',
    data: {
      labels: ['Initial amount', 'Income amount'],
      datasets: [{
        backgroundColor: [
          '#3498db',
          '#2ecc71',
        ],
        data: [json.initialAmount, json.incomeAmount],
      },
      ],
    },
  });
}

function formatDate(date) {
  return (date.getMonth() + 1) + '/' + date.getDate() + '/' +  date.getFullYear();
}
