document.getElementById("form").addEventListener("submit", function(event) {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    
    if (username === "admin" && password === "admin") {
      alert("Login successful!");
     
    } else {
      alert("Invalid username or password.");
      event.preventDefault(); 
    }
  });