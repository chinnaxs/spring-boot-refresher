#!/usr/bin/zsh

set -e

docker run -d -e SWAGGER_HOST=http://localhost \
  -e SWAGGER_URL=http://localhost \
  -e SWAGGER_BASE_PATH=/v2 -p 80:8080 swaggerapi/petstore

sleep 5s

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 0,
  "name": "doggie",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 1,
  "name": "max",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 2,
  "name": "jane",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 3,
  "name": "jack",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 3,
  "name": "jack",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 4,
  "name": "julia",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 5,
  "name": "captain",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 6,
  "name": "carmen",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 7,
  "name": "xavier",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 8,
  "name": "brutus iii",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 9,
  "name": "jeff",
  "status": "available"
}'

curl -X 'POST' \
  'http://localhost/v2/pet' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 10,
  "name": "mayra",
  "status": "available"
}'