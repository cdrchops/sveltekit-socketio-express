// webSocketPluginVite.js
import injectSocketIO from './socketIoHandler';

export const webSocketServer = {
	name: 'webSocketServer',
	configureServer(server:any) {
		injectSocketIO(server.httpServer);
	}
};
