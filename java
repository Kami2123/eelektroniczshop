let cart = []; // Zmienna przechowująca produkty w koszyku

// Funkcja do dodawania produktów do koszyka
function addToCart(productName, productPrice) {
    // Tworzymy obiekt produktu i dodajemy go do koszyka
    const product = {
        name: productName,
        price: productPrice
    };
    cart.push(product);
    alert(`${productName} został dodany do koszyka!`);
}

// Funkcja do otwierania koszyka
function openCart() {
    const cartContainer = document.getElementById('cart');
    const cartItems = document.getElementById('cart-items');
    
    // Jeśli koszyk jest pusty
    if (cart.length === 0) {
        cartItems.innerHTML = '<p>Twój koszyk jest pusty.</p>';
    } else {
        cartItems.innerHTML = ''; // Wyczyść poprzednią zawartość koszyka
        
        // Wyświetl produkty w koszyku
        cart.forEach(item => {
            const cartItem = document.createElement('p');
            cartItem.textContent = `${item.name} - ${item.price} PLN`;
            cartItems.appendChild(cartItem);
        });
    }

    // Pokaż koszyk
    cartContainer.style.display = 'block';
}

// Funkcja do zamknięcia koszyka
document.getElementById('close-cart-btn').addEventListener('click', function () {
    document.getElementById('cart').style.display = 'none';
});

// Funkcja do przejścia do kasy (do implementacji później)
document.getElementById('checkout-btn').addEventListener('click', function () {
    alert('Przechodzisz do kasy!');
});
