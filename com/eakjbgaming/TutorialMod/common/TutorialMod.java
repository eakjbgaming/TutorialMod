package com.eakjbgaming.TutorialMod.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="eakjbgaming_TutorialMod", name="Tutorial Mod", version="0.1")
@NetworkMod(clientSideRequired=true,serverSideRequired=true)

public class TutorialMod {
	@Instance("eakjbgaming_TutorialMod")
	public static TutorialMod instance;
	
}
