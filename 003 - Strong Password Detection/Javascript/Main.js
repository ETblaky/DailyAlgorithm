/**
 * Created by tiago on 31/07/2017.
 */

var pass = prompt("Please type the password you want to check: ");
var txt;

if (pass === null || pass === "") {
    txt = "You did not typed your password.";
} else {
    var upper = false;
    pass.split("").forEach(function (l, p2, p3) { if(l === l.toUpperCase()) {upper = true;} });

    var lower = false;
    pass.split("").forEach(function (l, p2, p3) { if(l === l.toLowerCase()) {lower = true;} });

    var number = false;
    pass.split("").forEach(function (l, p2, p3) { if(!isNaN(l)) {number = true;} });

    var length = false;
    length = pass.length > 8;

    var points = 0;
    if(upper) points++;
    if(lower) points++;
    if(number) points++;
    if(length) points++;

}

document.getElementsByTagName("body")[0].innerHTML = "The security level of your password is " +  Math.round(100*points/4) + "%";
