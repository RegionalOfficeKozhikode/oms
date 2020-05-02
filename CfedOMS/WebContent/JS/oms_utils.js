

function showEmailPopup(){
	var senderEmail = prompt("Enter your email id : ");
	alert(senderEmail);
	
	  $.ajax({
	        type: "GET",
	        url: "mailBusinessCard.html",
	        data: { emailId : senderEmail}
	      }).done(function( msg ) {
	        alert( "Data Saved: " + msg );
	      });
}