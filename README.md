# scriptum-lessons

A Scriptum lessons catalog, served to a Scriptum deployment by pointing
its `LESSONS_CATALOG_REPO` environment variable at this repo — no Scriptum
rebuild or redeploy needed to add or edit a lesson, just a commit here.

See [Authoring Lesson Modules](https://github.com/ColeHunt/scriptum/blob/main/docs/lessons/authoring-modules.md)
in the Scriptum repo for the full schema reference this repo follows.

## Layout

```text
modules.json              the catalog manifest, at repo root
modules/<id>/              one directory per module: the complete starting project
checkpoints/<id>/setup.sh  optional, runs once right after the module loads
checkpoints/<id>/verify/   per-checkpoint verifier scripts
```

## What's here

Two modules, ported from Scriptum's own bundled `catalog/` as a worked
example that both checkpoint-free and checkpoint-with-setup-script modules
load and verify correctly from a remote repo:

- **`hello-world`** (`plain-java`) — one checkpoint, no `setupScript`.
- **`git-basics`** (`git`) — five checkpoints verifying real git history
  (commit, branch, merge, conflict resolution, rebase), built by `setupScript`
  immediately after the module loads.

## Publishing

1. Push this repo to GitHub (public, since Scriptum's remote catalog
   fetches over an unauthenticated `raw.githubusercontent.com` URL).
2. On the Scriptum control plane, set `LESSONS_CATALOG_REPO=<owner>/scriptum-lessons`
   (and `LESSONS_CATALOG_BRANCH` if not using `main`).
3. Commit and push changes here — Scriptum caches the module list for 60
   seconds, so edits go live within about a minute.
