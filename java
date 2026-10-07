
// MENU MOBILE
// ========================================

const menuBtn = document.getElementById("menuBtn");
const menu = document.getElementById("menu");

if (menuBtn && menu) {

    menuBtn.addEventListener("click", () => {

        menu.classList.toggle("aberto");

    });

}


// ========================================
// TEMA ESCURO
// ========================================

const temaBtn = document.getElementById("temaBtn");

if (temaBtn) {

    temaBtn.addEventListener("click", () => {

        document.body.classList.toggle("dark");

        if (document.body.classList.contains("dark")) {

            localStorage.setItem("tema", "dark");

        } else {

            localStorage.setItem("tema", "light");

        }

    });

}


// Recuperar tema salvo

const temaSalvo = localStorage.getItem("tema");

if (temaSalvo === "dark") {

    document.body.classList.add("dark");

}


// ========================================
// NEWSLETTER
// ========================================

const newsletterForm =
    document.getElementById("newsletterForm");


if (newsletterForm) {

    newsletterForm.addEventListener("submit", function(event) {

        event.preventDefault();

        const email =
            document.getElementById("newsletterEmail").value;

        if (email) {

            alert(
                "Cadastro realizado com sucesso!\n\n" +
                "E-mail: " + email
            );

            newsletterForm.reset();

        }

    });

}


// ========================================
// LOGIN
// ========================================

const loginForm =
    document.getElementById("loginForm");


if (loginForm) {

    loginForm.addEventListener("submit", function(event) {

        event.preventDefault();

        const email =
            document.getElementById("email").value;

        const senha =
            document.getElementById("senha").value;


        if (!email || !senha) {

            alert("Preencha todos os campos.");

            return;

        }


        alert(
            "Login realizado com sucesso!\n\n" +
            "Bem-vindo ao Portal Agora."
        );

        loginForm.reset();

    });

}


// ========================================
// CADASTRO
// ========================================

const cadastroForm =
    document.getElementById("cadastroForm");


if (cadastroForm) {

    cadastroForm.addEventListener("submit", function(event) {

        event.preventDefault();


        const nome =
            document.getElementById("nome").value;

        const email =
            document.getElementById("emailCadastro").value;

        const senha =
            document.getElementById("senhaCadastro").value;

        const confirmar =
            document.getElementById("confirmarSenha").value;


        if (!nome || !email || !senha || !confirmar) {

            alert("Preencha todos os campos.");

            return;

        }


        if (senha.length < 6) {

            alert(
                "A senha precisa ter pelo menos 6 caracteres."
            );

            return;

        }


        if (senha !== confirmar) {

            alert("As senhas não são iguais.");

            return;

        }


        alert(
            "Conta criada com sucesso!\n\n" +
            "Bem-vindo, " + nome + "!"
        );


        cadastroForm.reset();

    });

}


// ========================================
// COMPARTILHAMENTO
// ========================================

function compartilhar(rede) {

    const url = window.location.href;

    const titulo =
        "Novos projetos prometem transformar cidades brasileiras";


    if (rede === "WhatsApp") {

        const link =
            "https://wa.me/?text=" +
            encodeURIComponent(titulo + " " + url);

        window.open(link, "_blank");

    }


    else if (rede === "Facebook") {

        const link =
            "https://www.facebook.com/sharer/sharer.php?u=" +
            encodeURIComponent(url);

        window.open(link, "_blank");

    }


    else if (rede === "X") {

        const link =
            "https://twitter.com/intent/tweet?text=" +
            encodeURIComponent(titulo) +
            "&url=" +
            encodeURIComponent(url);

        window.open(link, "_blank");

    }

}


// ========================================
// ÚLTIMA HORA
// ========================================

const noticiasBreaking = [

    "Novas medidas movimentam o cenário nacional nesta manhã.",

    "Tecnologia ganha espaço em projetos de infraestrutura.",

    "Mercado acompanha novas decisões econômicas.",

    "Cidades anunciam novos projetos para os próximos meses."

];


const breakingText =
    document.getElementById("breakingText");


if (breakingText) {

    let noticiaAtual = 0;


    setInterval(() => {

        noticiaAtual++;

        if (noticiaAtual >= noticiasBreaking.length) {

            noticiaAtual = 0;

        }


        breakingText.style.opacity = "0";


        setTimeout(() => {

            breakingText.textContent =
                noticiasBreaking[noticiaAtual];

            breakingText.style.opacity = "1";

        }, 250);


    }, 4000);

}
