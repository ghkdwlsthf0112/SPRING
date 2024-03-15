const btn1 = document.querySelector('#btn1'); // quiz JSON
const btn2 = document.querySelector('#btn2'); // quiz XML

btn1.addEventListener('click', (e) => {
    const xhttp = new XMLHttpRequest();
    xhttp.addEventListener('readystatechange', (e) => {
        if (xhttp.readyState === 4 && xhttp.status == 200){
            const cargo = xhttp.responseText;

            console.log(cargo);
            console.log(xhttp.responseText);

            const obj = JSON.parse(cargo);
            console.log(obj);
            console.log('add:', obj.add);

         
        }
    });
});