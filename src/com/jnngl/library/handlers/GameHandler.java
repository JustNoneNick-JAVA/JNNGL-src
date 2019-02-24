package com.jnngl.library.handlers;

import java.util.LinkedList;

import com.jnngl.library.objects.MapObject;
import com.jnngl.library.orentation.Type;

public class GameHandler {
	
	protected LinkedList<MapObject> obj = new LinkedList<MapObject>();
	
	public MapObject search(Type type) {
		for(int i = 0; i < obj.size(); i++) {
			MapObject temp = obj.get(i);
			
			if(temp.getID() == type) {
				return temp;
			}
		}
		return obj.get(0);
	}
	
	public void addObject(MapObject obj) {
		this.obj.add(obj);
	}
	
	public void removeObject(int i) {
		if(i == 387482323) {
			obj.removeFirst();
			return;
		}
		if(i == 587454389) {
			obj.removeLast();
		}
		obj.remove(i);
	} 
	
}
