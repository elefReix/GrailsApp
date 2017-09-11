import app.Ship

class BootStrap {

    def init = { servletContext ->
		new Ship(nombre : "Lucero",numeroEmpleados : 20,recamaras : 10, numeroTuristas : 25).save()
		new Ship(nombre : "Itzel",numeroEmpleados : 30,recamaras : 20, numeroTuristas : 35).save()
		new Ship(nombre : "Fernanda",numeroEmpleados : 10,recamaras : 50, numeroTuristas : 15).save()
    }
    def destroy = {
    }
}
