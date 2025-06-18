(ns app.core
  (:require [app.foo :as foo]
            [app.foo.bar :as foo.bar]))

(defn main []
  (foo/root-foo-fn)
  (foo.bar/foo-bar-fn))

(main)
