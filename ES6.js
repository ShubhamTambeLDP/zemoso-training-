// Here is a bunch of Lorem Ipsum. You will need it. I recomend using word wrap to view this! View > Toggle Word Wrap
const lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi dictum lorem vel elit laoreet, vitae maximus ligula consectetur. Etiam magna quam, varius at risus eu, rutrum commodo lacus. Maecenas felis sem, consequat non congue non, vestibulum vitae orci. Etiam laoreet ultricies enim, sit amet gravida massa sodales vel. Vivamus tempus neque sed mi elementum ornare eget non lorem. Donec dapibus ex tortor, ut vehicula metus scelerisque eget. Aenean dictum iaculis nulla, vel dapibus justo dignissim quis. Curabitur vitae efficitur neque. Ut vitae orci semper, efficitur dolor eget, porta dui. Cras eu sapien aliquam mauris facilisis ullamcorper. Nullam facilisis sem diam, quis tempor felis interdum ut. Praesent eu nibh arcu. Proin a quam augue. Integer malesuada finibus sem eget consectetur. Aenean non hendrerit purus, quis auctor elit. Duis ullamcorper, ex vitae rutrum ullamcorper, diam justo maximus quam, eget pellentesque metus nunc sit amet arcu. Nunc id eros leo. Praesent ultricies, nunc sit amet finibus posuere, quam magna viverra lectus, non tincidunt tellus mauris sit amet turpis. Nam eleifend quam vel justo pulvinar euismod. Duis ac elit id risus ultricies sollicitudin vitae ac quam. Donec et cursus leo, non dignissim enim. Vestibulum in felis imperdiet, venenatis tortor iaculis, congue augue. Nullam egestas dui nec quam sagittis sollicitudin ac blandit turpis. Nunc in fermentum odio. Morbi sodales mi nibh, ac cursus felis ultricies sed. Quisque at porttitor risus. Aenean a massa in libero venenatis tempus sed in mi. Nullam luctus sapien eget sagittis egestas. Pellentesque eros sem, semper eu molestie in, commodo a lacus. Phasellus pellentesque erat magna, eu facilisis nibh porttitor eget. Ut id mi lobortis, consequat orci ac, vulputate metus. Sed vulputate turpis nec lectus malesuada lacinia. Quisque non mattis eros. Aliquam pellentesque urna vulputate, auctor nibh in, fermentum odio. Suspendisse aliquam neque et aliquam facilisis. Donec sapien felis, molestie vel vestibulum non, sagittis sed felis. Aenean sodales iaculis dolor eget malesuada. Fusce ac libero hendrerit, viverra nunc iaculis, maximus nisi. Nulla volutpat nisi purus, non interdum erat hendrerit vitae. Integer viverra dignissim cursus. Phasellus eu libero sed ex faucibus convallis. In et egestas ipsum. Cras a metus mollis, laoreet risus eget, ultrices purus. Duis at ligula venenatis, imperdiet nulla et, bibendum augue. Pellentesque eleifend libero maximus, pretium lectus et, condimentum metus. Nulla vel est diam. In fermentum ut nulla eget finibus. Aliquam at turpis sagittis, feugiat diam ac, pulvinar quam. Phasellus pretium porta aliquet. Nunc sit amet nisl viverra justo porttitor egestas vel vitae eros. Fusce sit amet fringilla sapien. Nunc placerat, est sit amet laoreet pretium, augue turpis lacinia ipsum, non luctus magna ipsum vel sapien. Fusce luctus odio eget nunc rutrum ullamcorper. Integer vel ligula id elit viverra aliquam. Praesent id ultricies neque. Quisque molestie tellus ac ex vulputate rhoncus. Donec nec massa eget augue tincidunt ultrices vitae at diam. Ut risus purus, egestas eu eros sed, egestas auctor erat. Integer vulputate erat nisi, in aliquet turpis faucibus vel. Praesent neque augue, congue at nunc ut, congue ultricies erat. Ut sed erat in dui ornare malesuada. Nam id elementum ex. Vestibulum condimentum erat quis erat molestie hendrerit. Etiam laoreet volutpat quam, eget ornare ex molestie mollis. Phasellus eros mi, ultrices vel dui ac, facilisis consectetur nunc. Aliquam erat volutpat. Donec rutrum laoreet iaculis."

// Add a list of colors to this array
const colors = [,"Green","Orange","White","Black","Yellow","Purple","Red","Blue"]


// Use this object for your random name generator. Enter in a bunch of objects with first and last names. When generating a new random name, try to grab a random first or last name from any object. Don't just take object as a whole.
const names =
[
    {
        firstName: "ram",
        lastName: "kadam"
    },
    {
        firstName: "shiva",
        lastName: "bhosale"
    },
    {
        firstName: "sham",
        lastName: "patil"
    },
    {
        firstName: "rewa",
        lastName: "pawar"
    },
    {
        firstName: "om",
        lastName: "bhor"
    },
    {
        firstName: "ravi",
        lastName: "mali"
    },
    {
        firstName: "balu",
        lastName: "more"
    },
]

// Returns a random number between 1-100
 let random1To100=()=> {
    let randomNum = 100*(Math.random())
    randomNum = Math.floor(randomNum)
    console.log(randomNum)
    document.getElementById("p1").innerHTML = randomNum
    }

//Returns a random number between "Start" and "End"
let random=(startNum, endNum=100)=> {
    let diff = endNum - startNum
    let randomNum = diff*(Math.random()) + startNum
    randomNum = Math.ceil(randomNum)
    console.log(randomNum)
    return randomNum
}
let randomBetween2Numbers=()=> {
    let startNum = Number(document.getElementById("randStart").value)
    let endNum = Number(document.getElementById("randEnd").value)
    document.getElementById("p2").innerHTML = random(startNum)
}

    //Returns a long Lorem Ipsum String
   
 setLorem=()=> {
    document.getElementById("p3").innerHTML = lorem
}

//Returns a Lorem Ipsum String based on the number of sentences specified

 loremSentence=()=>{
    let numberOfSentences = document.getElementById("loremSentence").value
    let newLoremSentence = lorem.split(".")
    

    let newLorem=""
    for(let i=0; i < numberOfSentences; i++){
        newLorem = newLorem +newLoremSentence[i] + "."
    }
    console.log(newLorem)
    document.getElementById("p4").innerHTML =newLorem
}

//Returns a Lorem Ipsum String based on the number of characters specified
 loremChrars=()=>{
    let numberOfChars = document.getElementById("loremChar").value
    let newLoremCharacters = lorem.split("")
    

    let newLoremChars=""
    for(let i=0; i < numberOfChars; i++){
        newLoremChars = newLoremChars +newLoremCharacters[i] 
    }
    console.log(newLoremChars)
    document.getElementById("p5").innerHTML = newLoremChars

}

//Returns the current date(formatted)
 let currentDate=()=> {
    let newDate = new Date()
    let currentDate = (newDate.getMonth() + 1) + "-" + newDate.getDay() + "-" + newDate.getFullYear()
    document.getElementById("p6").innerHTML = currentDate
}

// Returns the current time(formatted)

let currentTime=()=> {
    let newDate = new Date()
    let currentTime = newDate.getHours() + ":" + newDate.getMinutes() +  " mins " + newDate.getSeconds() + " secs"
    document.getElementById("p7").innerHTML = currentTime
}
//Converts Inches to Feet
let inchesToFeets=()=>{
    let inches = document.getElementById("inches").value;
    let feets = inches / 12;
    document.getElementById('p8').innerHTML = feets;
}
//Converts Feet to Inches
let feetsToInches=()=>{
    let feets = document.getElementById('feet').value;
    let inches = feets * 12;
    document.getElementById('p9').innerHTML = inches;
}

// Compares if two words are the same length
let compareWords=()=> {
    let word1 = document.getElementById("firstWord").value.length
    let word2 = document.getElementById("secondWord").value.length
    if (word1 == word2) {
        document.getElementById("p10").innerHTML = "Word Lengths are same."
    }
    else {
        document.getElementById("p10").innerHTML = "Word Lengths are not same."
    }
}

//Returns a random password
let generatePassword =()=>{
    let password = ""
    let randomChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz"
    for (let i = 0; i < 9; i++){
        password = password + randomChars.charAt(Math.random()*randomChars.length);
    }
    document.getElementById("p11").innerHTML = password
}

//Tells you if the number is even or odd
let checkEvenOdd=()=> {
    let num = document.getElementById("num").value
    if (num % 2 == 0) {
        document.getElementById("p12").innerHTML = "Even"
    }
     else if (num % 2 == 1) {
        document.getElementById("p12").innerHTML = "Odd"
    }
    else{
        document.getElementById("p12").innerHTML="invalid input"
    }
}

// Returns a random color

let randomColor=()=> {
    let randomNum = colors.length*(Math.random())
    randomNum = Math.floor(randomNum)
    document.getElementById("p13").innerHTML = colors[randomNum]
}

//Returns a random first and last name

let getRandomName=()=> {
    function getNumber() {
        let number = names.length*(Math.random())
        number = Math.floor(number)
        return number
    }
    let firstName = getNumber()
    let lastName = getNumber()
    document.getElementById("p14").innerHTML = names[firstName].firstName + " " + names[lastName].lastName
}






