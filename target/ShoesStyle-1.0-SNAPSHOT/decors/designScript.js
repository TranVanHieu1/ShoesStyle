let midSole = document.querySelector(".midSole"),
    sockLining = document.querySelector(".sockLining"),
    collar = document.querySelectorAll(".collar"),
    upperEyestay = document.querySelector(".upperEyestay"),
    eyestay = document.querySelectorAll(".eyestay"),
    lowerEyestay = document.querySelector(".lowerEyestay"),
    heel = document.querySelector(".heel"),
    toeBox = document.querySelector(".toeBox"),
    tip = document.querySelector(".tip"),
    quarter = document.querySelector(".quarter"),
    swoosh = document.querySelector(".swoosh"),
    lace = document.querySelectorAll(".lace"),
    tongue = document.querySelectorAll(".tongue"),
    tongueRim = document.querySelector(".tongueRim"),
    tongueTag = document.querySelector(".tongueTag"),
    outSole = document.querySelectorAll(".outSole")

let midSoleColor = document.getElementById("midSoleColor"),
    sockLiningColor = document.getElementById("sockLiningColor"),
    collarColor = document.getElementById("collarColor"),
    upperEyestayColor = document.getElementById("upperEyestayColor"),
    eyestayColor = document.getElementById("eyestayColor"),
    lowerEyestayColor = document.getElementById("lowerEyestayColor"),
    heelColor = document.getElementById("heelColor"),
    toeBoxColor = document.getElementById("toeBoxColor"),
    tipColor = document.getElementById("tipColor"),
    quarterColor = document.getElementById("quarterColor"),
    swooshColor = document.getElementById("swooshColor"),
    laceColor = document.getElementById("laceColor"),
    tongueColor = document.getElementById("tongueColor"),
    tongueRimColor = document.getElementById("tongueRimColor"),
    tongueTagColor = document.getElementById("tongueTagColor"),
    outsoleColor = document.getElementById("outsoleColor")

midSoleColor.addEventListener("input", () => {
    midSole.style.fill = midSoleColor.value;
})

sockLiningColor.addEventListener("input", () => {
    sockLining.style.fill = sockLiningColor.value;
})

collar.forEach(item => collarColor.addEventListener("input", () => {
    item.style.fill = collarColor.value;
}))


upperEyestayColor.addEventListener("input", () => {
    upperEyestay.style.fill = upperEyestayColor.value;
})

eyestay.forEach(item => eyestayColor.addEventListener("input", () => {
    item.style.fill = eyestayColor.value;
}))

lowerEyestayColor.addEventListener("input", () => {
    lowerEyestay.style.fill = lowerEyestayColor.value;
})

heelColor.addEventListener("input", () => {
    heel.style.fill = heelColor.value;
})

toeBoxColor.addEventListener("input", () => {
    toeBox.style.fill = toeBoxColor.value;
})

tipColor.addEventListener("input", () => {
    tip.style.fill = tipColor.value;
})

quarterColor.addEventListener("input", () => {
    quarter.style.fill = quarterColor.value;
})

swooshColor.addEventListener("input", () => {
    swoosh.style.fill = swooshColor.value;
})

lace.forEach(item => laceColor.addEventListener("input", () =>{
    item.style.fill = laceColor.value;
}))

tongue.forEach(item => tongueColor.addEventListener("input", () => {
    item.style.fill = tongueColor.value;
}))

tongueRimColor.addEventListener("input", () => {
    tongueRim.style.fill = tongueRimColor.value;
})

tongueTagColor.addEventListener("input", () => {
    tongueTag.style.fill = tongueTagColor.value;
})

outSole.forEach(item => outsoleColor.addEventListener("input", () => {
    item.style.fill = outsoleColor.value;
}))