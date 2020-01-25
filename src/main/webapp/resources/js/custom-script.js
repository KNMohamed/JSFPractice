function onStatusChange(data) {
    var spinner = document.getElementById("spinner");
    var status = data.status;
    if (status === "begin") {
        spinner.style.display = "inline";
    } else {
        spinner.style.display = "none";
    }
}