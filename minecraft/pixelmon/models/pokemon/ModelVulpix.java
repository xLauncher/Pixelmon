// Date: 7/18/2012 12:04:55 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.pokemon;

import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

import net.minecraft.src.Entity;

public class ModelVulpix extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer Mane;
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg3;
	ModelRenderer Leg4;
	ModelRenderer TailInnerL;
	ModelRenderer TailInnerR;
	ModelRenderer TailMiddleR;
	ModelRenderer TailMiddleL;
	ModelRenderer TailOuterR;
	ModelRenderer TailOuterL;
	ModelRenderer TCurlInnerR;
	ModelRenderer TCurlInnerL;
	ModelRenderer TCurlMiddleL;
	ModelRenderer TCurlMiddleR;
	ModelRenderer TCurlOuterL;
	ModelRenderer TCurlOuterR;
	ModelRenderer TFluffInnerL;
	ModelRenderer TFluffInnerR;
	ModelRenderer TFluffMiddleR;
	ModelRenderer TFluffMiddleL;
	ModelRenderer TFluffOuterL;
	ModelRenderer TFluffOuterR;
	ModelRenderer HEADBASE;
	ModelRenderer Bangs;
	ModelRenderer HCurlR;
	ModelRenderer HCurlL;
	ModelRenderer HCurlM;
	ModelRenderer Ear1;
	ModelRenderer Ear2;
	ModelRenderer Shape1;
	ModelRenderer Nose;
	ModelRenderer Head;

	public ModelVulpix() {
		textureWidth = 64;
		textureHeight = 32;
		setTextureOffset("HEADBASE.WhateverIwant", 0, 0);

		Body = new ModelRenderer(this, 27, 20);
		Body.addBox(-4F, -2F, -3F, 4, 5, 4);
		Body.setRotationPoint(2F, 17F, 1F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 1.570796F, 0F, 0F);
		Mane = new ModelRenderer(this, 17, 10);
		Mane.addBox(-4F, -3F, -3F, 4, 4, 4);
		Mane.setRotationPoint(2F, 17F, -2F);
		Mane.setTextureSize(64, 32);
		Mane.mirror = true;
		setRotation(Mane, 1.570796F, 0F, 0F);
		Leg1 = new ModelRenderer(this, 18, 22);
		Leg1.addBox(-1F, 0F, -1F, 2, 5, 2);
		Leg1.setRotationPoint(-1.1F, 19F, 3F);
		Leg1.setTextureSize(64, 32);
		Leg1.mirror = true;
		setRotation(Leg1, 0F, 0F, 0F);
		Leg1.mirror = false;
		Leg2 = new ModelRenderer(this, 18, 22);
		Leg2.addBox(-1F, 0F, -1F, 2, 5, 2);
		Leg2.setRotationPoint(1.1F, 19F, 3F);
		Leg2.setTextureSize(64, 32);
		Leg2.mirror = true;
		setRotation(Leg2, 0F, 0F, 0F);
		Leg3 = new ModelRenderer(this, 18, 22);
		Leg3.addBox(-1F, 0F, -1F, 2, 5, 2);
		Leg3.setRotationPoint(-1.1F, 19F, -4F);
		Leg3.setTextureSize(64, 32);
		Leg3.mirror = true;
		setRotation(Leg3, 0F, 0F, 0F);
		Leg3.mirror = false;
		Leg4 = new ModelRenderer(this, 18, 22);
		Leg4.addBox(-1F, 0F, -1F, 2, 5, 2);
		Leg4.setRotationPoint(1.1F, 19F, -4F);
		Leg4.setTextureSize(64, 32);
		Leg4.mirror = true;
		setRotation(Leg4, 0F, 0F, 0F);
		TailInnerL = new ModelRenderer(this, 10, 21);
		TailInnerL.addBox(-0.5F, 0F, -1F, 1, 4, 2);
		TailInnerL.setRotationPoint(0F, 17F, 2.8F);
		TailInnerL.setTextureSize(64, 32);
		TailInnerL.mirror = true;
		setRotation(TailInnerL, 2.96706F, 0F, 0.2617994F);
		TailInnerR = new ModelRenderer(this, 10, 21);
		TailInnerR.addBox(-0.5F, 0F, -1F, 1, 4, 2);
		TailInnerR.setRotationPoint(0F, 17F, 2.8F);
		TailInnerR.setTextureSize(64, 32);
		TailInnerR.mirror = true;
		setRotation(TailInnerR, 2.96706F, 0F, -0.2617994F);
		TailMiddleR = new ModelRenderer(this, 10, 21);
		TailMiddleR.addBox(-0.5F, 0F, -1F, 1, 4, 2);
		TailMiddleR.setRotationPoint(0F, 17F, 2.9F);
		TailMiddleR.setTextureSize(64, 32);
		TailMiddleR.mirror = true;
		setRotation(TailMiddleR, 2.96706F, 0F, -0.8726646F);
		TailMiddleL = new ModelRenderer(this, 10, 21);
		TailMiddleL.addBox(-0.5F, 0F, -1F, 1, 4, 2);
		TailMiddleL.setRotationPoint(0F, 17F, 2.9F);
		TailMiddleL.setTextureSize(64, 32);
		TailMiddleL.mirror = true;
		setRotation(TailMiddleL, 2.96706F, 0F, 0.8726646F);
		TailOuterR = new ModelRenderer(this, 10, 21);
		TailOuterR.addBox(-0.5F, 0F, -1F, 1, 4, 2);
		TailOuterR.setRotationPoint(0F, 17F, 3F);
		TailOuterR.setTextureSize(64, 32);
		TailOuterR.mirror = true;
		setRotation(TailOuterR, 2.96706F, 0F, -1.48353F);
		TailOuterL = new ModelRenderer(this, 10, 21);
		TailOuterL.addBox(-0.5F, 0F, -1F, 1, 4, 2);
		TailOuterL.setRotationPoint(0F, 17F, 3F);
		TailOuterL.setTextureSize(64, 32);
		TailOuterL.mirror = true;
		setRotation(TailOuterL, 2.96706F, 0F, 1.48353F);
		TCurlInnerR = new ModelRenderer(this, 1, 21);
		TCurlInnerR.addBox(-0.5F, -0.5F, -2F, 1, 3, 3);
		TCurlInnerR.setRotationPoint(-1F, 13.3F, 3.6F);
		TCurlInnerR.setTextureSize(64, 32);
		TCurlInnerR.mirror = true;
		setRotation(TCurlInnerR, 2.443461F, 0F, -0.2617994F);
		TCurlInnerL = new ModelRenderer(this, 1, 21);
		TCurlInnerL.addBox(-0.5F, -0.5F, -2F, 1, 3, 3);
		TCurlInnerL.setRotationPoint(1F, 13.3F, 3.6F);
		TCurlInnerL.setTextureSize(64, 32);
		TCurlInnerL.mirror = true;
		setRotation(TCurlInnerL, 2.443461F, 0F, 0.2617994F);
		TCurlMiddleL = new ModelRenderer(this, 1, 21);
		TCurlMiddleL.addBox(-0.5F, -0.5F, -2F, 1, 3, 3);
		TCurlMiddleL.setRotationPoint(3F, 14.5F, 3.7F);
		TCurlMiddleL.setTextureSize(64, 32);
		TCurlMiddleL.mirror = true;
		setRotation(TCurlMiddleL, 2.443461F, 0F, 0.8726646F);
		TCurlMiddleR = new ModelRenderer(this, 1, 21);
		TCurlMiddleR.addBox(-0.5F, -0.5F, -2F, 1, 3, 3);
		TCurlMiddleR.setRotationPoint(-3F, 14.5F, 3.7F);
		TCurlMiddleR.setTextureSize(64, 32);
		TCurlMiddleR.mirror = true;
		setRotation(TCurlMiddleR, 2.443461F, 0F, -0.8726646F);
		TCurlOuterL = new ModelRenderer(this, 1, 21);
		TCurlOuterL.addBox(-0.5F, -0.5F, -2F, 1, 3, 3);
		TCurlOuterL.setRotationPoint(3.8F, 16.6F, 3.8F);
		TCurlOuterL.setTextureSize(64, 32);
		TCurlOuterL.mirror = true;
		setRotation(TCurlOuterL, 2.443461F, 0F, 1.48353F);
		TCurlOuterR = new ModelRenderer(this, 1, 21);
		TCurlOuterR.addBox(-0.5F, -0.5F, -2F, 1, 3, 3);
		TCurlOuterR.setRotationPoint(-3.8F, 16.6F, 3.8F);
		TCurlOuterR.setTextureSize(64, 32);
		TCurlOuterR.mirror = true;
		setRotation(TCurlOuterR, 2.443461F, 0F, -1.48353F);
		TFluffInnerL = new ModelRenderer(this, 1, 16);
		TFluffInnerL.addBox(-1F, -0.5F, -2F, 2, 2, 2);
		TFluffInnerL.setRotationPoint(1.3F, 12.5F, 3.5F);
		TFluffInnerL.setTextureSize(64, 32);
		TFluffInnerL.mirror = true;
		setRotation(TFluffInnerL, 2.443461F, 0F, 0.2617994F);
		TFluffInnerR = new ModelRenderer(this, 1, 16);
		TFluffInnerR.addBox(-1F, -0.5F, -2F, 2, 2, 2);
		TFluffInnerR.setRotationPoint(-1.3F, 12.5F, 3.5F);
		TFluffInnerR.setTextureSize(64, 32);
		TFluffInnerR.mirror = true;
		setRotation(TFluffInnerR, 2.443461F, 0F, -0.2617994F);
		TFluffMiddleR = new ModelRenderer(this, 1, 16);
		TFluffMiddleR.addBox(-1F, -0.5F, -2F, 2, 2, 2);
		TFluffMiddleR.setRotationPoint(-3.6F, 14F, 3.6F);
		TFluffMiddleR.setTextureSize(64, 32);
		TFluffMiddleR.mirror = true;
		setRotation(TFluffMiddleR, 2.443461F, 0F, -0.8726646F);
		TFluffMiddleL = new ModelRenderer(this, 1, 16);
		TFluffMiddleL.addBox(-1F, -0.5F, -2F, 2, 2, 2);
		TFluffMiddleL.setRotationPoint(3.6F, 14F, 3.6F);
		TFluffMiddleL.setTextureSize(64, 32);
		TFluffMiddleL.mirror = true;
		setRotation(TFluffMiddleL, 2.443461F, 0F, 0.8726646F);
		TFluffOuterL = new ModelRenderer(this, 1, 16);
		TFluffOuterL.addBox(-1F, -0.5F, -2F, 2, 2, 2);
		TFluffOuterL.setRotationPoint(4.5F, 16.6F, 3.7F);
		TFluffOuterL.setTextureSize(64, 32);
		TFluffOuterL.mirror = true;
		setRotation(TFluffOuterL, 2.443461F, 0F, 1.48353F);
		TFluffOuterR = new ModelRenderer(this, 1, 16);
		TFluffOuterR.addBox(-1F, -0.5F, -2F, 2, 2, 2);
		TFluffOuterR.setRotationPoint(-4.5F, 16.6F, 3.7F);
		TFluffOuterR.setTextureSize(64, 32);
		TFluffOuterR.mirror = true;
		setRotation(TFluffOuterR, 2.443461F, 0F, -1.48353F);
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0F, 16F, -4F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		ModelRenderer Bangs = new ModelRenderer(this, 1, 1);
		Bangs = new ModelRenderer(this, 1, 1);
		Bangs.addBox(-2F, 0F, -2F, 2, 0, 2);
		Bangs.setRotationPoint(-0.2F, -3.8F, -0.8F);
		Bangs.setTextureSize(64, 32);
		Bangs.mirror = true;
		setRotation(Bangs, 0.1919862F, -0.9250245F, -0.2792527F);
		ModelRenderer HCurlR = new ModelRenderer(this, 1, 4);
		HCurlR = new ModelRenderer(this, 1, 4);
		HCurlR.addBox(-0.5F, -2.5F, -2F, 1, 3, 3);
		HCurlR.setRotationPoint(0F, -2.8F, -0.2F);
		HCurlR.setTextureSize(64, 32);
		HCurlR.mirror = true;
		setRotation(HCurlR, 0.3490659F, 0.2617994F, -0.6108652F);
		ModelRenderer HCurlL = new ModelRenderer(this, 1, 4);
		HCurlL = new ModelRenderer(this, 1, 4);
		HCurlL.addBox(-0.5F, -2.5F, -2F, 1, 3, 3);
		HCurlL.setRotationPoint(0F, -2.8F, -0.2F);
		HCurlL.setTextureSize(64, 32);
		HCurlL.mirror = true;
		setRotation(HCurlL, 0.3490659F, -0.2617994F, 0.6108652F);
		ModelRenderer HCurlM = new ModelRenderer(this, 1, 4);
		HCurlM = new ModelRenderer(this, 1, 4);
		HCurlM.addBox(-0.5F, -2.5F, -2F, 1, 3, 3);
		HCurlM.setRotationPoint(0F, -2.8F, -0.2F);
		HCurlM.setTextureSize(64, 32);
		HCurlM.mirror = true;
		setRotation(HCurlM, 0.3490659F, 0F, 0F);
		ModelRenderer Ear2 = new ModelRenderer(this, 10, 16);
		Ear2 = new ModelRenderer(this, 10, 16);
		Ear2.addBox(-1F, -3F, -0.5F, 2, 3, 1);
		Ear2.setRotationPoint(1.2F, -2.5F, 0F);
		Ear2.setTextureSize(64, 32);
		Ear2.mirror = true;
		setRotation(Ear2, 0F, -0.4363323F, 0.8726646F);
		ModelRenderer Ear1 = new ModelRenderer(this, 10, 16);
		Ear1 = new ModelRenderer(this, 10, 16);
		Ear1.addBox(-1F, -3F, -0.5F, 2, 3, 1);
		Ear1.setRotationPoint(-1.2F, -2.5F, 0F);
		Ear1.setTextureSize(64, 32);
		Ear1.mirror = true;
		setRotation(Ear1, 0F, 0.4363323F, -0.8726646F);
		ModelRenderer Shape1 = new ModelRenderer(this, 26, 0);
		Shape1 = new ModelRenderer(this, 26, 0);
		Shape1.addBox(-0.5F, -0.5F, -3F, 1, 1, 4);
		Shape1.setRotationPoint(0F, -1.1F, -2.2F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		ModelRenderer Nose = new ModelRenderer(this, 1, 11);
		Nose = new ModelRenderer(this, 1, 11);
		Nose.addBox(-1F, -1F, -2F, 2, 2, 2);
		Nose.setRotationPoint(0F, -0.5F, -3F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, 0F, 0F, 0F);
		ModelRenderer Head = new ModelRenderer(this, 10, 1);
		Head = new ModelRenderer(this, 10, 1);
		Head.addBox(-3F, -3F, -2F, 4, 4, 4);
		Head.setRotationPoint(1F, 0F, -1F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		HEADBASE.addChild(Bangs);
		HEADBASE.addChild(HCurlR);
		HEADBASE.addChild(HCurlL);
		HEADBASE.addChild(HCurlM);
		HEADBASE.addChild(Ear1);
		HEADBASE.addChild(Ear2);
		HEADBASE.addChild(Shape1);
		HEADBASE.addChild(Nose);
		HEADBASE.addChild(Head);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Mane.render(f5);
		Leg1.render(f5);
		Leg2.render(f5);
		Leg3.render(f5);
		Leg4.render(f5);
		TailInnerL.render(f5);
		TailInnerR.render(f5);
		TailMiddleR.render(f5);
		TailMiddleL.render(f5);
		TailOuterR.render(f5);
		TailOuterL.render(f5);
		TCurlInnerR.render(f5);
		TCurlInnerL.render(f5);
		TCurlMiddleL.render(f5);
		TCurlMiddleR.render(f5);
		TCurlOuterL.render(f5);
		TCurlOuterR.render(f5);
		TFluffInnerL.render(f5);
		TFluffInnerR.render(f5);
		TFluffMiddleR.render(f5);
		TFluffMiddleL.render(f5);
		TFluffOuterL.render(f5);
		TFluffOuterR.render(f5);
		HEADBASE.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADBASE.rotateAngleX = f4 / 57.29578F;
		HEADBASE.rotateAngleY = f3 / 57.29578F;
		Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		Leg1.rotateAngleY = 0.0F;
		Leg2.rotateAngleY = 0.0F;
		Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		Leg4.rotateAngleY = 0.0F;
		Leg3.rotateAngleY = 0.0F;
	}

}
