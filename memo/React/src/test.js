var div,
  container = document.getElementById("container");
for (let i = 0; i < 5; i++) {
  div = document.createElement("div");
  div.textContent = "Box #" + (i + 1); // ボックスに番号を表示
  div.style.border = "1px solid black"; // ボックスに枠線を追加
  div.style.margin = "5px"; // ボックスのマージンを追加

  div.onclick = function () {
    alert("This is box #" + i);
  };

  container.appendChild(div);
}
