function inputEmailFunction() {
	var x = document.getElementById("femail");
	if(x.value.length == 0){
		x.value = "Enter your email";
	}
	else if(!validateEmail(x.value)){
		alert("You have entered an invalid email address!");
	}
}

function inputMsgFunction() {
	var x = document.getElementById("form-msg");
	if(x.value.length == 0){
		x.value = "Tell us how to improve....";
	}
}

function validateEmail(mail) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail))
  {
    return (true)
  }
   return (false)
}

function emailFocus(){
	var x = document.getElementById("femail");
	if(x.value == "Enter your email"){
		x.value = '';
	}
}

function msgFocus(){
	var x = document.getElementById("form-msg");
	if(x.value == "Tell us how to improve...."){
		x.value = '';
	}
}

function validateForm(){
	var x = document.getElementById("femail");
	if(!validateEmail(x.value)){
		alert("You have entered an invalid email address! Please check an re-enter.");
		return false;
	}
}