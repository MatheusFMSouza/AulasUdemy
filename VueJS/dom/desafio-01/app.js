new Vue({
    el: '#desafio',
    data: {
        nome: 'Matheus Fideles',
        idade: 21,
        link: 'http://files.cod3r.com.br/curso-vue/vue.jpg'
    },
    methods: {
        idades: function () {
            return this.idade * 3;
        },
        num: function () {
            return Math.random();
        }
    }
})