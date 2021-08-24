var app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue!',
        destinos: ["Mendoza", "San Luis", "Tucuman"],
        destinoElegido: "",
        fechaElegida: "",
        cantidadElegida: 0,
        nombre: "",
        apellido: "",
        vuelos: [],
        pasaje: {}
    },
    methods: {
        checkFlight: function () {
            var search = {
                "destino": this.destinoElegido,
                "fecha": this.fechaElegida,
                "cantidad": this.cantidadElegida
            }
            console.log(search)
            if (this.destinoElegido != "" && this.fechaElegida != "") {
                fetch('/api/searchFlights?destino=' + this.destinoElegido + '&fecha=' + this.fechaElegida)
                .then(function (respuesta) {
                    if (respuesta.status == 202) {
                        return respuesta.json();
                    } else {
                        throw new Error(respuesta.status);
                    }
                })
                    .then((response) => {
                        this.vuelos = response
                    })
            }else if(this.destinoElegido != ""){
                fetch('/api/searchFlights?destino=' + this.destinoElegido)
                .then(function (respuesta) {
                    if (respuesta.status == 202) {
                        return respuesta.json();
                    } else {
                        throw new Error(respuesta.status);
                    }
                })
                .then((response) => {
                    this.vuelos = response
                }) 
            }else if(this.fechaElegida != ""){
                fetch('/api/searchFlights?fecha=' + this.fechaElegida)
                .then(function (respuesta) {
                    if (respuesta.status == 202) {
                        return respuesta.json();
                    } else {
                        throw new Error(respuesta.status);
                    }
                })
                .then((response) => {
                    this.vuelos = response
                })
            }else{
                fetch('/api/searchFlights')
                .then(function (respuesta) {
                    if (respuesta.status == 202) {
                        return respuesta.json();
                    } else {
                        throw new Error(respuesta.status);
                    }
                })
                .then((response) => {
                    this.vuelos = response
                }) 
            }
            $('#vuelosModal').modal('show')
        },
        checkin: function(index) {
            console.log(index)
            this.pasaje = this.vuelos[index]
            if(this.pasaje.capacidad >= this.cantidadElegida){
                $("#vuelosModal").modal('hide');
                $("#pasajeModal").modal('show');
            }

        }

    }
})