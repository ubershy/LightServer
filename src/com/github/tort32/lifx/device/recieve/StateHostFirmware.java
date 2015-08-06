package com.github.tort32.lifx.device.recieve;

import com.github.tort32.lifx.protocol.InBuffer;
import com.github.tort32.lifx.protocol.Types.*;
import com.github.tort32.lifx.protocol.message.Payload;

public class StateHostFirmware extends Payload {
	public static final int ID = 15;
	public static final int LENGTH = 20;

	public UInt64 mBuild; // firmware build time (absolute time in nanoseconds since epoch)
	public UInt64 mReserved;
	public UInt32 mVersion; // firmware version

	public StateHostFirmware(InBuffer buffer) {
		super(ID, LENGTH);
		buffer.checkLength(LENGTH);
		mBuild = buffer.readUInt64();
		mReserved = buffer.readUInt64();
		mVersion = buffer.readUInt32();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName() + " {\n");
		sb.append("  mBuild=" + mBuild + "\n");
		sb.append("  mReserved=" + mReserved + "\n");
		sb.append("  mVersion=" + mVersion + "\n");
		sb.append("}");
		return sb.toString();
	}
}
