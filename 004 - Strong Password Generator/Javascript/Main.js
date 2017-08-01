/**
 * Created by tiago on 01/08/2017.
 */

$( function() {
    $( "#initial" ).dialog({
        resizable: false,
        height: "auto",
        width: 400,
        modal: true,
        buttons: {
            "Random": function() {
                $( this ).dialog( "close" );

                var length = prompt("How Many Characters?");


                var text = "";
                var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

                for (var i = 0; i < length; i++)
                    text += possible.charAt(Math.floor(Math.random() * possible.length));

                alert("Your password is: " + text);

            },
            "By Sentence": function() {
                $( this ).dialog( "close" );

                var length = prompt("How Many Characters?");
                var sentence = prompt("Type a base sentence.").split(' ');
                var word = sentence[Math.floor(Math.random() * sentence.length)];

                if(word.length > length) {

                    var text = "";
                    var possible = "0123456789";

                    for (var i = 0; i < 2; i++)
                        text += possible.charAt(Math.floor(Math.random() * possible.length));

                    alert("Your password is: " + word.substring(0, length - 2).charAt(0).toUpperCase() + word.substring(0, length - 2).slice(1) + text);

                } else if (word.length == length){

                    var text = "";
                    var possible = "0123456789";

                    for (var i = 0; i < 3; i++)
                        text += possible.charAt(Math.floor(Math.random() * possible.length));

                    alert("Your password is: " + word.substring(0, length - 3).charAt(0).toUpperCase() + word.substring(0, length - 3).slice(1) + text);

                } else {
                    var nLength = length - word.length;

                    var text = "";
                    var possible = "0123456789";

                    for (var i = 0; i < nLength; i++)
                        text += possible.charAt(Math.floor(Math.random() * possible.length));

                    alert("Your password is: " + word.charAt(0).toUpperCase() + word.slice(1) + text);

                }

            }
        }
    });
} );

