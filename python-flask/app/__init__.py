from flask import Flask

app = Flask(__name__)

@app.get("/")
def hello():
    return {"message": "Hello from Flask in Docker!"}
