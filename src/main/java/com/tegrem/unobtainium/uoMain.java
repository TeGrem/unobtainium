/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tegrem.unobtainium;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mod.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 *
 * @author TeGrem
 */

@Mod(modid = uoMain.modId, name = uoMain.modName, version = uoMain.version)

public class uoMain {
    public static final String modId = "Unobtainium";
    public static final String modName = "Unobtainium: The Magic Ore";
    public static final String version = "1.7.10PA0.0.1";
    
    @Instance
    public static uoMain instance = new uoMain();
    
       
    @SidedProxy(clientSide="com.tegrem.unobtainium.ClientProxy", serverSide = "com.tegrem.unobtainium.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
    }
 
}

