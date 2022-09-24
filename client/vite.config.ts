import { sveltekit } from '@sveltejs/kit/vite';
import { webSocketServer } from './webSocketPluginVite';
import type { UserConfig } from 'vite';

/** @type {import('vite').UserConfig} */
const config: UserConfig = {
	server: {
		port: 3000
	},
	preview: {
		port: 3000
	},
	plugins: [sveltekit(), webSocketServer]
};






export default config;
