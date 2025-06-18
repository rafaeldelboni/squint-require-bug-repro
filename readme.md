# Squint require with dot bug repro

The following code:
```clojure
(ns app.core
  (:require [app.foo :as foo]
            [app.foo.bar :as foo.bar]))
```

Produces this error message on the browser:
```
Uncaught SyntaxError: redeclaration of const foocore.mjs:3:13note: Previously declared at line 2, column 13
```

Which is the result of producing the following mjs code:
```javascript
import * as squint_core from "/@fs/home/delboni/Workspaces/clj/squint-require-bug-repro/node_modules/.vite/deps/squint-cljs_core__js.js?v=7b145cb1";
import * as foo from "/js/app/foo.mjs";
import * as foo.bar from "/js/app/foo/bar.mjs";
```

## Instructions

### Bootstrap
```bash
npm install
```

### Watch on http://localhost:5173
```bash
npm start
```
