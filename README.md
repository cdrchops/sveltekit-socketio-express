This is basic boilerplate code to create a Sveltekit client that connects to an Express server and uses SocketIO.  I've included a Grails server as well since I use Grails a lot.
The Grails server will eventually be just a REST client and nothing more as it will handle all database connections and create the REST endpoints.  You do not need Grails to use this project.

If you just want to use the Sveltekit-Express-SocketIO code just go into the client directory then run ```npm install``` and ```npm run-script dev```

If you want to use Grails you'll need to start the Grails server by going to the server directory and run ```grails run-app```

These are my current SDK settings.  You'll need to install SDK from sdkman.io.  I also run everything in a Debian WSL container on Windows
gradle: 6.9.2
grails: 5.2.2
groovy: 4.0.4
java: 11.0.12-open


client code based on this template: https://github.com/JomoPipi/svelte_socket_starter

server code is a generic grails server - it is wired for MySQL 8 where you need to change the username, password, and database name in the application.yml  If you're using Grails I expect you'll know how to install Grails and modify the application.yml

I believe all of the code I've used is mostly MIT License.  You will need to respect those licenses.

The code I've written is all MIT.  I don't care what you do with the code, just don't blame me

