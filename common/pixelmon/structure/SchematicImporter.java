package pixelmon.structure;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import pixelmon.comm.EnumPackets;
import pixelmon.comm.PixelmonDataPacket;
import pixelmon.storage.PokeballManager.PokeballManagerMode;

import net.minecraft.src.CompressedStreamTools;
import net.minecraft.src.NBTBase;
import net.minecraft.src.NBTTagCompound;

public class SchematicImporter {
	private String filename;
	private int [][][] blocks;

	public SchematicImporter(String filename) {
		this.filename = filename;
	}

	public void readSchematic() {
		NBTTagCompound n = getNBTTag();
		if (n == null)
			return;
		
		int width = n.getShort("Width");
		int height = n.getShort("Height");
		int length = n.getShort("Length");
		
		blocks = new int[width][height][length];
		byte[] blockArray = n.getByteArray("Blocks");
		int i=0;
		for (int y =0; y < length; y++){
			for (int z = 0; z < height; z++){
				for (int x =0; x <width; x++){
					blocks[x][z][y] = blockArray[i++];
				}
			}
		}

	}

	NBTTagCompound getNBTTag() {
		try {
			File file = new File(filename);
			return CompressedStreamTools.readCompressed(new FileInputStream(file));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
