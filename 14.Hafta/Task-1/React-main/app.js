import axios from "axios"; // Axios kütüphanesini içe aktar

async function getUser(id) {
    // Kullanıcı verilerini al
    const users = await axios(`https://jsonplaceholder.typicode.com/users/${id}`); 
    const postRes = await axios(`https://jsonplaceholder.typicode.com/posts?userId=${id}`);
    // Gerekli özellikleri ayıkla (Destructuring)
    const { id: userId, name, username, email, address, phone, website, company } = users.data;
    // Post verilerini al
    const posts = postRes.data;
    // Kullanıcı verileri ve postları içeren yeni bir nesne oluştur
    const userData = { id: userId, name, username, email, address, phone, website, company, posts};

    return userData;
}

// Modülün varsayılan çıktısı olarak dışarı aktar
export default getUser;