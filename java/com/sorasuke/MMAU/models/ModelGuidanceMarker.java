package com.sorasuke.MMAU.models;

import com.sorasuke.MMAU.MMAULogger;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@SideOnly(Side.CLIENT)
public class ModelGuidanceMarker extends ModelBase {
    //fields
    ModelRenderer Shape1;

    public ModelGuidanceMarker() {
        textureWidth = 64;
        textureHeight = 32;
        
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-2F, -2F, -2F, 4, 4, 4);
        Shape1.setRotationPoint(0F, 0F, 0F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0, 0, 0);
    }
    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
    }
    
    public void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
    }

    public void setSpin(float x, float y, float z){
        this.Shape1.rotateAngleX = x;
        this.Shape1.rotateAngleY = y;
        this.Shape1.rotateAngleZ = z;
    }

}
