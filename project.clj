(def agentproxy-version "0.0.7")

(defproject org.clojars.glebpom/clj-ssh "0.5.12-SNAPSHOT"
  :description "Library for using SSH from clojure."
  :url "https://github.com/glebpom/clj-ssh"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/tools.logging "0.3.1"
                  :exclusions [org.clojure/clojure]]
                 [com.jcraft/jsch.agentproxy.usocket-jna ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.usocket-nc ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.sshagent ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.pageant ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.core ~agentproxy-version]
                 [com.jcraft/jsch.agentproxy.jsch ~agentproxy-version]
                 [com.jcraft/jsch "0.1.53"]]
  :jvm-opts ["-Djava.awt.headless=true"])
