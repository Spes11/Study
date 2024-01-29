let getById = document.getElementById.bind(document);
let clickAction = () => {
  let url = getById("url");
  console.log(url.value);
};

getById("getButton").onclick = clickAction;
