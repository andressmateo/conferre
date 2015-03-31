from base import db

class Conferencia(db.Model):
    id = db.Column(db.Integer, unique=True, primary_key=True)
    nombre = db.Column(db.String(200), unique=True)
    descripcion = db.Column(db.Text)
    fecha = db.Column(db.Text)
    precio = db.Column(db.Integer)

    def __init__(self, nombre, descripcion, fecha, precio):
        self.nombre = nombre
        self.descripcion = descripcion
        self.fecha = fecha
        self.precio = precio


class evento (db.Model):
    id = db.Column(db.Integer, unique=True, primary_key=True)
    nombre = db.Column(db.Text)
    tipo = db.Column(db.Text)

    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

class silla (db.Model):
    id = db.Column(db.Integer, unique=True, primary_key=True)
    tipo = db.Column(db.Text)

    def __init__(self, tipo):
        self.tipo = tipo


