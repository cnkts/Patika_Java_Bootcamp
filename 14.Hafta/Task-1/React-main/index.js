// app.js dosyasından "getUser" fonksiyonunu içe aktar
import getUser from "./app.js";

async function getUserData() {
    // "getUser" fonksiyonunu user id = 1 ile çağır
    const user = await getUser(1);
    console.log(user);
}

// "getUserData" fonksiyonunu çalıştırarak kodu çalıştır
getUserData();