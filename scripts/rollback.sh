#!/bin/bash
set -e

echo "Iniciando rollback..."
kubectl rollout undo deployment/mi-proyecto-pruebas -n production
kubectl rollout status deployment/mi-proyecto-pruebas -n production
echo "Rollback completado exitosamente"