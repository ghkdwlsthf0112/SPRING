console.log('hi!');

const div1 = document.querySelector('#div1');
const div2 = $('#div2');

console.log(div1);
console.log(div2);

div2.addClass('btn');
div2.addClass('warning');
div2.click((e) => {
    console.log(e);
    console.log('div2 clicked@@');
});

const ajaxBtn = $('#ajax-btn');

ajaxBtn.click((e) => {
	/* 
		url: 요청주소
		method: 요청 방식
		dataTy[e: 요청 성공후 받을 데이터의 타입
		success:
	*/
    const ajaxSettings = {
        url: 'employee/101',
        method: 'GET', 
        dataType: 'json',
        success: () => (emp, state, xhttp) => {

            console.log('전달받은 데이터:', emp);
            console.log('상태 코드:', state);
            console.log(xhttp);
        }
    };

    $.ajax(ajaxSettings);
});