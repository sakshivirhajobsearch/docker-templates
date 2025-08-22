# Ready-to-Use Docker Templates

Templates included:
- `python-flask` → http://localhost:8000
- `node-express` → http://localhost:3000
- `java-springboot` → http://localhost:8082
- `php-apache` → http://localhost:8080
- `static-nginx` → http://localhost:8081

## How to use
1) Pick a folder.
2) Run:
   ```bash
   docker compose up --build
   ```
3) Open the URL shown above.

## Customize
- Replace the sample code with your app, keeping the same entry points.
- For Python: keep `app:app` as the Flask app entry point (or adjust the Gunicorn command).
- For Node: adjust `PORT` in compose and `server.js` if needed.
- For Java: keep the Spring Boot structure; Dockerfile builds the jar in a multi-stage build.
- For PHP/Static: replace files in `src/` or `site/`.
