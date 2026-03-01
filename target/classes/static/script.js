let donors = JSON.parse(localStorage.getItem("donors")) || [];
document.getElementById("registerForm")?.addEventListener("submit", e => { e.preventDefault();
    let d = {
        name: document.getElementById("name").value,
        blood: document.getElementById("bloodGroup").value,
        city: document.getElementById("city").value,
        phone: document.getElementById("phone").value
    };
    donors.push(d);
    localStorage.setItem("donors", JSON.stringify(donors));
    alert("Registered Successfully");
    e.target.reset();
});
document.getElementById("searchBtn")?.addEventListener("click", () => { let blood = searchBloodGroup.value, cityVal = searchCity.value.toLowerCase();
    let results = donors.filter(d => (blood === "Any" || d.blood === blood) && d.city.toLowerCase().includes(cityVal));
    resultsContainer.innerHTML = results.length ? results.map(d => <div class="donor-card"><h3>${d.name}</h3><p>${d.city}</p><span class="badge">${d.blood}</span><p>${d.phone}</p></div>).join("") : "<p>No donors found</p>";
});