(ns lamb.core.main
    (:require [neko.activity :refer [defactivity set-content-view!]]
              [neko.debug :refer [*a]]
              [neko.threading :refer [on-ui]]
              [neko.log :as log]))

(defactivity lamb.core.MainActivity
  :key :main
  :on-create
  (fn [this bundle]
    (on-ui
      (log/d "I am here")
      (set-content-view! (*a)
        [:linear-layout {}
         [:text-view {:text "Hello from Clojure!"}]
         [:button {:text "Press Me" :on-click ()}]]))))
