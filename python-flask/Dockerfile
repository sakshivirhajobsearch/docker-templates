FROM python:3.12-slim

# Prevent Python from writing .pyc files and enable unbuffered logs
ENV PYTHONDONTWRITEBYTECODE=1 PYTHONUNBUFFERED=1

WORKDIR /app

# Install dependencies
COPY requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy application code
COPY app/ app/

EXPOSE 8000
# Use Gunicorn for production serving
CMD ["python","-m","gunicorn","-w","2","-b","0.0.0.0:8000","app:app"]
