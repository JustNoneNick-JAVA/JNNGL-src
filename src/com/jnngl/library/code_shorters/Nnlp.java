package com.jnngl.library.code_shorters;

import com.jnngl.library.audio.WavPlayer;
import com.jnngl.library.camera.Camera;
import com.jnngl.library.console.ConsoleSystem;
import com.jnngl.library.controllers.KeysController;
import com.jnngl.library.controllers.MouseController;
import com.jnngl.library.files.FileSystem;
import com.jnngl.library.mutiplayer.Client;
import com.jnngl.library.mutiplayer.Server;
import com.jnngl.library.util.vectors.Vector1i;
import com.jnngl.library.util.vectors.Vector1j;
import com.jnngl.library.util.vectors.Vector1k;
import com.jnngl.library.util.vectors.Vector2i;
import com.jnngl.library.util.vectors.Vector3f;

public final class Nnlp {
	
	public static final WavPlayer audio = new WavPlayer();
	public static final KeysController keys = new KeysController();
	public static final MouseController mouse = new MouseController();
	public static final Camera cam = new Camera();
	public static final FileSystem files = new FileSystem();
	public static final ConsoleSystem console = new ConsoleSystem();
	
	/**
	 * Multiplayer
	 */
	public static final Server server = new Server();
	public static final Client client = new Client();
	
	/**
	 * Vectors
	 */
	public static final Vector3f vector = new Vector3f();
	public static final Vector3f vector3f = new Vector3f(0, 0, 0);
	public static final Vector2i vector2i = new Vector2i(0, 0);
	public static final Vector1i vector1i = new Vector1i(0);
	public static final Vector1j vector1j = new Vector1j(0);
	public static final Vector1k vector1k = new Vector1k(0);
	
}
