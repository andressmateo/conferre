from negocio_rules import app
from capa_datos import data
from flask import request, json

@app.route("/add_conferencia", methods=['POST', 'GET'])
def add_conferencia():
    data.add_conferencia(request.args.get("nombre"),request.args.get("descripcion"),request.args.get("fecha"),
                         request.args.get("precio"))
    return

@app.route("/add_evento", methods=['POST', 'GET'])
def add_evento():
    data.add_evento(request.args.get("nombre"),request.args.get("tipo"))
    return

@app.route("/add_silla", methods=['POST', 'GET'])
def add_silla():
    data.add_silla(request.args.get("tipo"))
    return