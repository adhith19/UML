function addstudents() {
    let name = document.getElementById("name").value;
    if (name === "") {
        alert("Enter the student name");
        return;
    }
    let li = document.createElement("li");
    li.textContent = name;
    document.getElementById("students").appendChild(li);
    document.getElementById("name").value = "";
}
