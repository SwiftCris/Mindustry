#!/bin/bash

# Get the latest run ID
latest_run_id=$(gh run list --limit 1 --json databaseId -q '.[0].databaseId')

if [ -z "$latest_run_id" ]; then
  echo "No runs found or gh not authenticated."
  exit 1
fi

echo "Latest run ID: $latest_run_id"

# Download artifacts from the latest run
gh run download "$latest_run_id" --dir ./artifacts

echo "Artifacts downloaded to ./artifacts"
