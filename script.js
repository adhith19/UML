function calculateBill(){
    let units = Number(document.getElementById("units").value);
    let bills = 0;
    if(units <=100){
        bills = units*2;
    }
    else if(units <= 200){
        bills = (100*2)+((units - 100 )*3);
    }
    else if(units <= 500){
        bills = (100*2)+( 100 *3)+((units - 200 )*5);

    }
    else{
        bills = (100*2)+((100*3)+( 300*5))+ ((units - 500 )*7);
    }
    document.getElementById("result").innerHTML = "Total Electricity Bills = Rs"+bills;
}