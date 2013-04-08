// Date: 3/24/2013 12:38:50 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.Quadruped.SkeletonQuadruped;

public class ModelTauros extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;
	PixelmonModelRenderer TailL;
	PixelmonModelRenderer TailM;
	PixelmonModelRenderer TailR;
	PixelmonModelRenderer TailL2;
	PixelmonModelRenderer TailM2;
	PixelmonModelRenderer TailR2;
	PixelmonModelRenderer TailL3;
	PixelmonModelRenderer TailM3;
	PixelmonModelRenderer TailR3;

	public ModelTauros() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 8, -4);
		PixelmonModelRenderer BodyMainUpper = new PixelmonModelRenderer(this,
				0, 0);
		BodyMainUpper.addBox(-5.5F, -8.9F, -4.4F, 11, 11, 6);
		BodyMainUpper.setTextureSize(128, 64);
		BodyMainUpper.mirror = true;
		setRotation(BodyMainUpper, 0F, 0F, 0F);
		PixelmonModelRenderer StomachLAngleFront = new PixelmonModelRenderer(
				this, 0, 0);
		StomachLAngleFront.addBox(2.5F, -0.2F, -3.2F, 3, 3, 7);
		StomachLAngleFront.setTextureSize(128, 64);
		StomachLAngleFront.mirror = true;
		setRotation(StomachLAngleFront, 0F, 0F, -0.7853982F);
		PixelmonModelRenderer StomachRAngleFront = new PixelmonModelRenderer(
				this, 0, 0);
		StomachRAngleFront.addBox(-5.5F, -0.2F, -3.2F, 3, 3, 7);
		StomachRAngleFront.setTextureSize(128, 64);
		StomachRAngleFront.mirror = true;
		setRotation(StomachRAngleFront, 0F, 0F, 0.7853982F);
		PixelmonModelRenderer StomachLAngleBack = new PixelmonModelRenderer(
				this, 0, 0);
		StomachLAngleBack.addBox(0.8F, 0F, 2.8F, 4, 3, 7);
		StomachLAngleBack.setTextureSize(128, 64);
		StomachLAngleBack.mirror = true;
		setRotation(StomachLAngleBack, 0.2443461F, 0.1745329F, -0.7853982F);
		PixelmonModelRenderer StomachRAngleBack = new PixelmonModelRenderer(
				this, 0, 0);
		StomachRAngleBack.addBox(-4.8F, 0F, 2.8F, 4, 3, 7);
		StomachRAngleBack.setTextureSize(128, 64);
		StomachRAngleBack.mirror = true;
		setRotation(StomachRAngleBack, 0.2443461F, -0.1745329F, 0.7853982F);
		PixelmonModelRenderer StomachLFront = new PixelmonModelRenderer(this,
				0, 0);
		StomachLFront.addBox(-0.1F, -1.9F, -3.2F, 6, 7, 7);
		StomachLFront.setTextureSize(128, 64);
		StomachLFront.mirror = true;
		setRotation(StomachLFront, 0F, 0F, 0F);
		PixelmonModelRenderer StomachRFront = new PixelmonModelRenderer(this,
				0, 0);
		StomachRFront.addBox(-5.9F, -1.9F, -3.2F, 6, 7, 7);
		StomachRFront.setTextureSize(128, 64);
		StomachRFront.mirror = true;
		setRotation(StomachRFront, 0F, 0F, 0F);
		PixelmonModelRenderer StomachMainBack = new PixelmonModelRenderer(this,
				0, 0);
		StomachMainBack.addBox(-5.5F, -1.3F, 2.8F, 11, 7, 7);
		StomachMainBack.setTextureSize(128, 64);
		StomachMainBack.mirror = true;
		setRotation(StomachMainBack, 0.1745329F, 0F, 0F);
		PixelmonModelRenderer Mane3 = new PixelmonModelRenderer(this, 104, 0);
		Mane3.addBox(-6F, -10.4F, -8F, 12, 11, 2);
		Mane3.setTextureSize(128, 64);
		Mane3.mirror = true;
		setRotation(Mane3, 0.3490659F, 0F, 0F);
		PixelmonModelRenderer BodyMainUpperAngle = new PixelmonModelRenderer(
				this, 0, 0);
		BodyMainUpperAngle.addBox(-5F, -8.5F, -3.1F, 10, 11, 6);
		BodyMainUpperAngle.setTextureSize(128, 64);
		BodyMainUpperAngle.mirror = true;
		setRotation(BodyMainUpperAngle, -0.5235988F, 0F, 0F);
		PixelmonModelRenderer Mane1 = new PixelmonModelRenderer(this, 106, 0);
		Mane1.addBox(-5F, -12.8F, -7.8F, 10, 13, 3);
		Mane1.setTextureSize(128, 64);
		Mane1.mirror = true;
		setRotation(Mane1, 0.7853982F, 0F, 0F);
		PixelmonModelRenderer BodyLowerBack = new PixelmonModelRenderer(this,
				0, 0);
		BodyLowerBack.addBox(-4.5F, -7.5F, 3.7F, 9, 8, 12);
		BodyLowerBack.setTextureSize(128, 64);
		BodyLowerBack.mirror = true;
		setRotation(BodyLowerBack, -0.2617994F, 0F, 0F);
		PixelmonModelRenderer Mane5 = new PixelmonModelRenderer(this, 98, 0);
		Mane5.addBox(-7F, -9.5F, -5.8F, 14, 10, 3);
		Mane5.setTextureSize(128, 64);
		Mane5.mirror = true;
		setRotation(Mane5, 0.1745329F, 0F, 0F);
		PixelmonModelRenderer Ass = new PixelmonModelRenderer(this, 0, 0);
		Ass.addBox(-4F, -2.8F, 8F, 8, 7, 9);
		Ass.setTextureSize(128, 64);
		Ass.mirror = true;
		setRotation(Ass, 0F, 0F, 0F);
		PixelmonModelRenderer Mane2 = new PixelmonModelRenderer(this, 105, 1);
		Mane2.addBox(-5.5F, -12.8F, -4.8F, 11, 13, 2);
		Mane2.setTextureSize(128, 64);
		Mane2.mirror = true;
		setRotation(Mane2, 0.7853982F, 0F, 0F);
		PixelmonModelRenderer BeardLowerFlat = new PixelmonModelRenderer(this,
				88, 10);
		BeardLowerFlat.addBox(-2.5F, 6.2F, -9.3F, 5, 3, 0);
		BeardLowerFlat.setTextureSize(128, 64);
		BeardLowerFlat.mirror = true;
		setRotation(BeardLowerFlat, 0.3490659F, 0F, 0F);
		PixelmonModelRenderer Mane4 = new PixelmonModelRenderer(this, 102, 0);
		Mane4.addBox(-6.5F, -10.4F, -6F, 13, 11, 2);
		Mane4.setTextureSize(128, 64);
		Mane4.mirror = true;
		setRotation(Mane4, 0.3490659F, 0F, 0F);
		PixelmonModelRenderer Mane5FlatR = new PixelmonModelRenderer(this, 90,
				-2);
		Mane5FlatR.addBox(-5.8F, -9.5F, 6.6F, 0, 10, 2);
		Mane5FlatR.setTextureSize(128, 64);
		Mane5FlatR.mirror = true;
		setRotation(Mane5FlatR, 0F, -1.570796F, -0.1745329F);
		PixelmonModelRenderer BeardUpper = new PixelmonModelRenderer(this, 102,
				0);
		BeardUpper.addBox(-3F, 3.2F, -11F, 6, 5, 7);
		BeardUpper.setTextureSize(128, 64);
		BeardUpper.mirror = true;
		setRotation(BeardUpper, -0.5235988F, 0F, 0F);
		PixelmonModelRenderer Mane4FlatR = new PixelmonModelRenderer(this, 90,
				-2);
		Mane4FlatR.addBox(-6F, -10F, 6.1F, 0, 10, 2);
		Mane4FlatR.setTextureSize(128, 64);
		Mane4FlatR.mirror = true;
		setRotation(Mane4FlatR, 0F, -1.570796F, -0.3490659F);
		PixelmonModelRenderer BeardMid = new PixelmonModelRenderer(this, 112, 0);
		BeardMid.addBox(-2.5F, -1.8F, -9.3F, 5, 8, 3);
		BeardMid.setTextureSize(128, 64);
		BeardMid.mirror = true;
		setRotation(BeardMid, 0.3490659F, 0F, 0F);
		PixelmonModelRenderer Mane1FlatR = new PixelmonModelRenderer(this, 90,
				-2);
		Mane1FlatR.addBox(-7.8F, -12.7F, 4.6F, 0, 10, 2);
		Mane1FlatR.setTextureSize(128, 64);
		Mane1FlatR.mirror = true;
		setRotation(Mane1FlatR, 0F, -1.570796F, -0.7853982F);
		PixelmonModelRenderer Mane5FlatBackL = new PixelmonModelRenderer(this,
				94, -2);
		Mane5FlatBackL.addBox(7F, -9.5F, -2.8F, 0, 10, 2);
		Mane5FlatBackL.setTextureSize(128, 64);
		Mane5FlatBackL.mirror = true;
		setRotation(Mane5FlatBackL, 0.1745329F, 0F, 0F);
		PixelmonModelRenderer Mane3FlatR = new PixelmonModelRenderer(this, 90,
				-2);
		Mane3FlatR.addBox(-8F, -10F, 5.9F, 0, 10, 2);
		Mane3FlatR.setTextureSize(128, 64);
		Mane3FlatR.mirror = true;
		setRotation(Mane3FlatR, 0F, -1.570796F, -0.3490659F);
		PixelmonModelRenderer Mane5FlatBackR = new PixelmonModelRenderer(this,
				94, -2);
		Mane5FlatBackR.addBox(-7F, -9.5F, -2.8F, 0, 10, 2);
		Mane5FlatBackR.setTextureSize(128, 64);
		Mane5FlatBackR.mirror = true;
		setRotation(Mane5FlatBackR, 0.1745329F, 0F, 0F);
		PixelmonModelRenderer BeardUpperFlatR = new PixelmonModelRenderer(this,
				90, 0);
		BeardUpperFlatR.addBox(-8.2F, -10.9F, 2.7F, 0, 7, 2);
		BeardUpperFlatR.setTextureSize(128, 64);
		BeardUpperFlatR.mirror = true;
		setRotation(BeardUpperFlatR, 0F, -1.570796F, -1.047198F);
		PixelmonModelRenderer Mane5FlatL = new PixelmonModelRenderer(this, 90,
				-2);
		Mane5FlatL.addBox(5.8F, -9.5F, 6.6F, 0, 10, 2);
		Mane5FlatL.setTextureSize(128, 64);
		Mane5FlatL.mirror = true;
		setRotation(Mane5FlatL, 0F, 1.570796F, 0.1745329F);
		PixelmonModelRenderer BeardMidFlatR = new PixelmonModelRenderer(this,
				90, 2);
		BeardMidFlatR.addBox(-9.3F, 1.3F, 2.2F, 0, 6, 2);
		BeardMidFlatR.setTextureSize(128, 64);
		BeardMidFlatR.mirror = true;
		setRotation(BeardMidFlatR, 0F, -1.570796F, -0.3490659F);
		PixelmonModelRenderer Mane4FlatL = new PixelmonModelRenderer(this, 90,
				-2);
		Mane4FlatL.addBox(6F, -10F, 6.1F, 0, 10, 2);
		Mane4FlatL.setTextureSize(128, 64);
		Mane4FlatL.mirror = true;
		setRotation(Mane4FlatL, 0F, 1.570796F, 0.3490659F);
		PixelmonModelRenderer BeardMidFlatL = new PixelmonModelRenderer(this,
				90, 2);
		BeardMidFlatL.addBox(9.3F, 1.3F, 2.2F, 0, 6, 2);
		BeardMidFlatL.setTextureSize(128, 64);
		BeardMidFlatL.mirror = true;
		setRotation(BeardMidFlatL, 0F, 1.570796F, 0.3490659F);
		PixelmonModelRenderer Mane3FlatL = new PixelmonModelRenderer(this, 90,
				-2);
		Mane3FlatL.addBox(8F, -10F, 5.9F, 0, 10, 2);
		Mane3FlatL.setTextureSize(128, 64);
		Mane3FlatL.mirror = true;
		setRotation(Mane3FlatL, 0F, 1.570796F, 0.3490659F);
		PixelmonModelRenderer BeardUpperFlatL = new PixelmonModelRenderer(this,
				90, 0);
		BeardUpperFlatL.addBox(8.2F, -10.9F, 2.7F, 0, 7, 2);
		BeardUpperFlatL.setTextureSize(128, 64);
		BeardUpperFlatL.mirror = true;
		setRotation(BeardUpperFlatL, 0F, 1.570796F, 1.047198F);
		PixelmonModelRenderer Mane1FlatL = new PixelmonModelRenderer(this, 90,
				-2);
		Mane1FlatL.addBox(7.8F, -12.7F, 4.6F, 0, 10, 2);
		Mane1FlatL.setTextureSize(128, 64);
		Mane1FlatL.mirror = true;
		setRotation(Mane1FlatL, 0F, 1.570796F, 0.7853982F);
		Body.addChild(BodyMainUpper);
		Body.addChild(StomachLAngleFront);
		Body.addChild(StomachRAngleFront);
		Body.addChild(StomachLAngleBack);
		Body.addChild(StomachRAngleBack);
		Body.addChild(StomachLFront);
		Body.addChild(StomachRFront);
		Body.addChild(StomachMainBack);
		Body.addChild(Mane3);
		Body.addChild(BodyMainUpperAngle);
		Body.addChild(Mane1);
		Body.addChild(BodyLowerBack);
		Body.addChild(Mane5);
		Body.addChild(Ass);
		Body.addChild(Mane2);
		Body.addChild(BeardLowerFlat);
		Body.addChild(Mane4);
		Body.addChild(Mane5FlatR);
		Body.addChild(BeardUpper);
		Body.addChild(Mane4FlatR);
		Body.addChild(BeardMid);
		Body.addChild(Mane1FlatR);
		Body.addChild(Mane5FlatBackL);
		Body.addChild(Mane3FlatR);
		Body.addChild(Mane5FlatBackR);
		Body.addChild(BeardUpperFlatR);
		Body.addChild(Mane5FlatL);
		Body.addChild(BeardMidFlatR);
		Body.addChild(Mane4FlatL);
		Body.addChild(BeardMidFlatL);
		Body.addChild(Mane3FlatL);
		Body.addChild(BeardUpperFlatL);
		Body.addChild(Mane1FlatL);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -1, -17);
		PixelmonModelRenderer RHornLevel1X4 = new PixelmonModelRenderer(this,
				8, 27);
		RHornLevel1X4.addBox(-4F, -1F, 2.2F, 2, 1, 1);
		RHornLevel1X4.setTextureSize(128, 64);
		RHornLevel1X4.mirror = true;
		setRotation(RHornLevel1X4, 0.3490659F, -0.2617994F, -0.0872665F);
		PixelmonModelRenderer HeadR = new PixelmonModelRenderer(this, 16, 54);
		HeadR.addBox(-2F, -2F, 0F, 3, 5, 5);
		HeadR.setTextureSize(128, 64);
		HeadR.mirror = true;
		setRotation(HeadR, 0.3490659F, -0.2617994F, -0.0872665F);
		PixelmonModelRenderer BrowR = new PixelmonModelRenderer(this, 12, 47);
		BrowR.addBox(-2F, -1.5F, -2.7F, 2, 3, 4);
		BrowR.setTextureSize(128, 64);
		BrowR.mirror = true;
		setRotation(BrowR, 0.9773844F, -0.2094395F, -0.0698132F);
		PixelmonModelRenderer BrowL = new PixelmonModelRenderer(this, 0, 47);
		BrowL.addBox(0F, -1.5F, -2.7F, 2, 3, 4);
		BrowL.setTextureSize(128, 64);
		BrowL.mirror = true;
		setRotation(BrowL, 0.9773844F, 0.2094395F, 0.0698132F);
		PixelmonModelRenderer HeadL = new PixelmonModelRenderer(this, 0, 54);
		HeadL.addBox(-1F, -2F, 0F, 3, 5, 5);
		HeadL.setTextureSize(128, 64);
		HeadL.mirror = true;
		setRotation(HeadL, 0.3490659F, 0.2617994F, 0.0872665F);
		PixelmonModelRenderer RHornLevel3 = new PixelmonModelRenderer(this, 8,
				25);
		RHornLevel3.addBox(-6.2F, 1.5F, 1.5F, 1, 1, 1);
		RHornLevel3.setTextureSize(128, 64);
		RHornLevel3.mirror = true;
		setRotation(RHornLevel3, 0.3490659F, -0.2617994F, 0.5235988F);
		PixelmonModelRenderer RHornLevel4 = new PixelmonModelRenderer(this, 8,
				25);
		RHornLevel4.addBox(-4.9F, 4.4F, 1.5F, 1, 1, 1);
		RHornLevel4.setTextureSize(128, 64);
		RHornLevel4.mirror = true;
		setRotation(RHornLevel4, 0.5759587F, -0.5934119F, 1.047198F);
		PixelmonModelRenderer LHornLevel2X4 = new PixelmonModelRenderer(this,
				14, 27);
		LHornLevel2X4.addBox(3.6F, -0.2F, 2F, 2, 1, 1);
		LHornLevel2X4.setTextureSize(128, 64);
		LHornLevel2X4.mirror = true;
		setRotation(LHornLevel2X4, 0.3490659F, 0.2617994F, -0.1745329F);
		PixelmonModelRenderer LHornLevel2X2 = new PixelmonModelRenderer(this,
				14, 31);
		LHornLevel2X2.addBox(3.6F, -0.4F, 2.2F, 2, 1, 1);
		LHornLevel2X2.setTextureSize(128, 64);
		LHornLevel2X2.mirror = true;
		setRotation(LHornLevel2X2, 0.3490659F, 0.2617994F, -0.1745329F);
		PixelmonModelRenderer LHornBase = new PixelmonModelRenderer(this, 0, 31);
		LHornBase.addBox(0.4F, -1.8F, 2F, 2, 2, 2);
		LHornBase.setTextureSize(128, 64);
		LHornBase.mirror = true;
		setRotation(LHornBase, 0.3490659F, 0.2617994F, 0.0872665F);
		PixelmonModelRenderer RHornLevel2X2 = new PixelmonModelRenderer(this,
				14, 31);
		RHornLevel2X2.addBox(-5.6F, -0.4F, 2.2F, 2, 1, 1);
		RHornLevel2X2.setTextureSize(128, 64);
		RHornLevel2X2.mirror = true;
		setRotation(RHornLevel2X2, 0.3490659F, -0.2617994F, 0.1745329F);
		PixelmonModelRenderer RHornLevel2X1 = new PixelmonModelRenderer(this,
				14, 33);
		RHornLevel2X1.addBox(-5.6F, -0.4F, 2F, 2, 1, 1);
		RHornLevel2X1.setTextureSize(128, 64);
		RHornLevel2X1.mirror = true;
		setRotation(RHornLevel2X1, 0.3490659F, -0.2617994F, 0.1745329F);
		PixelmonModelRenderer LHornLevel1X1 = new PixelmonModelRenderer(this,
				8, 33);
		LHornLevel1X1.addBox(2F, -1.6F, 2.2F, 2, 1, 1);
		LHornLevel1X1.setTextureSize(128, 64);
		LHornLevel1X1.mirror = true;
		setRotation(LHornLevel1X1, 0.3490659F, 0.2617994F, 0.0872665F);
		PixelmonModelRenderer LHornLevel4 = new PixelmonModelRenderer(this, 8,
				25);
		LHornLevel4.addBox(3.9F, 4.4F, 1.5F, 1, 1, 1);
		LHornLevel4.setTextureSize(128, 64);
		LHornLevel4.mirror = true;
		setRotation(LHornLevel4, 0.5759587F, 0.5934119F, -1.047198F);
		PixelmonModelRenderer LHornLevel1X2 = new PixelmonModelRenderer(this,
				8, 31);
		LHornLevel1X2.addBox(2F, -1.6F, 2.8F, 2, 1, 1);
		LHornLevel1X2.setTextureSize(128, 64);
		LHornLevel1X2.mirror = true;
		setRotation(LHornLevel1X2, 0.3490659F, 0.2617994F, 0.0872665F);
		PixelmonModelRenderer LHornLevel3 = new PixelmonModelRenderer(this, 8,
				25);
		LHornLevel3.addBox(5.2F, 1.5F, 1.5F, 1, 1, 1);
		LHornLevel3.setTextureSize(128, 64);
		LHornLevel3.mirror = true;
		setRotation(LHornLevel3, 0.3490659F, 0.2617994F, -0.5235988F);
		PixelmonModelRenderer LHornLevel1X4 = new PixelmonModelRenderer(this,
				8, 27);
		LHornLevel1X4.addBox(2F, -1F, 2.2F, 2, 1, 1);
		LHornLevel1X4.setTextureSize(128, 64);
		LHornLevel1X4.mirror = true;
		setRotation(LHornLevel1X4, 0.3490659F, 0.2617994F, 0.0872665F);
		PixelmonModelRenderer LHornLevel2X1 = new PixelmonModelRenderer(this,
				14, 33);
		LHornLevel2X1.addBox(3.6F, -0.4F, 2F, 2, 1, 1);
		LHornLevel2X1.setTextureSize(128, 64);
		LHornLevel2X1.mirror = true;
		setRotation(LHornLevel2X1, 0.3490659F, 0.2617994F, -0.1745329F);
		PixelmonModelRenderer JawFillL = new PixelmonModelRenderer(this, 0, 42);
		JawFillL.addBox(0F, 0.8F, -2.7F, 2, 2, 3);
		JawFillL.setTextureSize(128, 64);
		JawFillL.mirror = true;
		setRotation(JawFillL, 0.5061455F, 0.2268928F, 0.0698132F);
		PixelmonModelRenderer LHornLevel1X3 = new PixelmonModelRenderer(this,
				8, 29);
		LHornLevel1X3.addBox(2F, -1F, 2.8F, 2, 1, 1);
		LHornLevel1X3.setTextureSize(128, 64);
		LHornLevel1X3.mirror = true;
		setRotation(LHornLevel1X3, 0.3490659F, 0.2617994F, 0.0872665F);
		PixelmonModelRenderer JawFillR = new PixelmonModelRenderer(this, 10, 42);
		JawFillR.addBox(-2F, 0.8F, -2.7F, 2, 2, 3);
		JawFillR.setTextureSize(128, 64);
		JawFillR.mirror = true;
		setRotation(JawFillR, 0.5061455F, -0.2268928F, -0.0698132F);
		PixelmonModelRenderer LHornLevel2X3 = new PixelmonModelRenderer(this,
				14, 29);
		LHornLevel2X3.addBox(3.6F, -0.2F, 2.2F, 2, 1, 1);
		LHornLevel2X3.setTextureSize(128, 64);
		LHornLevel2X3.mirror = true;
		setRotation(LHornLevel2X3, 0.3490659F, 0.2617994F, -0.1745329F);
		PixelmonModelRenderer LowerMouth = new PixelmonModelRenderer(this, 35,
				16);
		LowerMouth.addBox(-1.5F, 0.5F, -1.8F, 3, 3, 7);
		LowerMouth.setTextureSize(128, 64);
		LowerMouth.mirror = true;
		setRotation(LowerMouth, 0.1342561F, 0F, 0F);
		PixelmonModelRenderer RHornLevel2X4 = new PixelmonModelRenderer(this,
				14, 27);
		RHornLevel2X4.addBox(-5.6F, -0.2F, 2F, 2, 1, 1);
		RHornLevel2X4.setTextureSize(128, 64);
		RHornLevel2X4.mirror = true;
		setRotation(RHornLevel2X4, 0.3490659F, -0.2617994F, 0.1745329F);
		PixelmonModelRenderer ForeheadDot = new PixelmonModelRenderer(this, 11,
				40);
		ForeheadDot.addBox(-0.5F, -1.8F, -0.7F, 1, 1, 1);
		ForeheadDot.setTextureSize(128, 64);
		ForeheadDot.mirror = true;
		setRotation(ForeheadDot, 0.9773844F, 0F, 0F);
		PixelmonModelRenderer RHornBase = new PixelmonModelRenderer(this, 0, 27);
		RHornBase.addBox(-2.4F, -1.8F, 2F, 2, 2, 2);
		RHornBase.setTextureSize(128, 64);
		RHornBase.mirror = true;
		setRotation(RHornBase, 0.3490659F, -0.2617994F, -0.0872665F);
		PixelmonModelRenderer Snout = new PixelmonModelRenderer(this, 0, 35);
		Snout.addBox(-1.5F, -0.2F, -4F, 3, 3, 4);
		Snout.setTextureSize(128, 64);
		Snout.mirror = true;
		setRotation(Snout, 0.4833219F, 0F, 0F);
		PixelmonModelRenderer RHornLevel2X3 = new PixelmonModelRenderer(this,
				14, 29);
		RHornLevel2X3.addBox(-5.6F, -0.2F, 2.2F, 2, 1, 1);
		RHornLevel2X3.setTextureSize(128, 64);
		RHornLevel2X3.mirror = true;
		setRotation(RHornLevel2X3, 0.3490659F, -0.2617994F, 0.1745329F);
		PixelmonModelRenderer RHornLevel1X1 = new PixelmonModelRenderer(this,
				8, 33);
		RHornLevel1X1.addBox(-4F, -1.6F, 2.2F, 2, 1, 1);
		RHornLevel1X1.setTextureSize(128, 64);
		RHornLevel1X1.mirror = true;
		setRotation(RHornLevel1X1, 0.3490659F, -0.2617994F, -0.0872665F);
		PixelmonModelRenderer RHornLevel1X2 = new PixelmonModelRenderer(this,
				8, 31);
		RHornLevel1X2.addBox(-4F, -1.6F, 2.8F, 2, 1, 1);
		RHornLevel1X2.setTextureSize(128, 64);
		RHornLevel1X2.mirror = true;
		setRotation(RHornLevel1X2, 0.3490659F, -0.2617994F, -0.0872665F);
		PixelmonModelRenderer RHornLevel1X3 = new PixelmonModelRenderer(this,
				8, 29);
		RHornLevel1X3.addBox(-4F, -1F, 2.8F, 2, 1, 1);
		RHornLevel1X3.setTextureSize(128, 64);
		RHornLevel1X3.mirror = true;
		setRotation(RHornLevel1X3, 0.3490659F, -0.2617994F, -0.0872665F);
		Head.addChild(RHornLevel1X4);
		Head.addChild(HeadR);
		Head.addChild(BrowR);
		Head.addChild(BrowL);
		Head.addChild(HeadL);
		Head.addChild(RHornLevel3);
		Head.addChild(RHornLevel4);
		Head.addChild(LHornLevel2X4);
		Head.addChild(LHornLevel2X2);
		Head.addChild(LHornBase);
		Head.addChild(RHornLevel2X2);
		Head.addChild(RHornLevel2X1);
		Head.addChild(LHornLevel1X1);
		Head.addChild(LHornLevel4);
		Head.addChild(LHornLevel1X2);
		Head.addChild(LHornLevel3);
		Head.addChild(LHornLevel1X4);
		Head.addChild(LHornLevel2X1);
		Head.addChild(JawFillL);
		Head.addChild(LHornLevel1X3);
		Head.addChild(JawFillR);
		Head.addChild(LHornLevel2X3);
		Head.addChild(LowerMouth);
		Head.addChild(RHornLevel2X4);
		Head.addChild(ForeheadDot);
		Head.addChild(RHornBase);
		Head.addChild(Snout);
		Head.addChild(RHornLevel2X3);
		Head.addChild(RHornLevel1X1);
		Head.addChild(RHornLevel1X2);
		Head.addChild(RHornLevel1X3);

		TailL = new PixelmonModelRenderer(this, "Tail Left");
		TailL.setRotationPoint(0, 0, 17);
		TailL2 = new PixelmonModelRenderer(this, "Tail Left2");
		TailL2.setRotationPoint(1.5F, 2, 6);
		TailL3 = new PixelmonModelRenderer(this, "Tail Left3");
		TailL3.setRotationPoint(0, -1, 7);
		PixelmonModelRenderer LTailSeg3 = new PixelmonModelRenderer(this, 42,
				56);
		LTailSeg3.addBox(-0.5F, -0.6F, -0.1F, 1, 1, 7);
		LTailSeg3.setTextureSize(128, 64);
		LTailSeg3.mirror = true;
		setRotation(LTailSeg3, 0.3839724F, 0F, 0F);
		PixelmonModelRenderer LTailWhipFlat = new PixelmonModelRenderer(this,
				47, 56);
		LTailWhipFlat.addBox(-1.5F, 0F, 0F, 3, 0, 4);
		LTailWhipFlat.setRotationPoint(0, -2.5F, 6.3F);
		LTailWhipFlat.setTextureSize(128, 64);
		LTailWhipFlat.mirror = true;
		setRotation(LTailWhipFlat, 0.8551081F, 0F, 0F);
		PixelmonModelRenderer LTailSeg1 = new PixelmonModelRenderer(this, 42,
				56);
		LTailSeg1.addBox(1F, 0F, 0F, 1, 1, 7);
		LTailSeg1.setTextureSize(128, 64);
		LTailSeg1.mirror = true;
		setRotation(LTailSeg1, -0.2974289F, 0F, 0F);
		PixelmonModelRenderer LTailSeg2 = new PixelmonModelRenderer(this, 42,
				56);
		LTailSeg2.addBox(-0.5F, 0F, 0F, 1, 1, 7);
		LTailSeg2.mirror = true;
		setRotation(LTailSeg2, 0.2230717F, 0F, 0F);
		PixelmonModelRenderer LTailWhip = new PixelmonModelRenderer(this, 51,
				60);
		LTailWhip.addBox(-1F, -0.5F, 0F, 2, 1, 2);
		LTailWhip.setRotationPoint(0, -2.5F, 6.3F);
		LTailWhip.setTextureSize(128, 64);
		LTailWhip.mirror = true;
		setRotation(LTailWhip, 0.8551081F, 0F, 0F);

		TailR = new PixelmonModelRenderer(this, "Tail Left");
		TailR.setRotationPoint(0, 0, 17);
		TailR2 = new PixelmonModelRenderer(this, "Tail Left2");
		TailR2.setRotationPoint(-1.5F, -1, 6.5F);
		TailR3 = new PixelmonModelRenderer(this, "Tail Left3");
		TailR3.setRotationPoint(0, -2, 7F);
		PixelmonModelRenderer RTailWhipFlat = new PixelmonModelRenderer(this,
				47, 56);
		RTailWhipFlat.addBox(-1.5F, -0.2F, 0F, 3, 0, 4);
		RTailWhipFlat.setRotationPoint(0, -1, 5.9F);
		RTailWhipFlat.setTextureSize(128, 64);
		RTailWhipFlat.mirror = true;
		setRotation(RTailWhipFlat, 0.2617994F, 0F, 0F);
		PixelmonModelRenderer RTailSeg1 = new PixelmonModelRenderer(this, 42,
				56);
		RTailSeg1.addBox(-2F, 0F, 0F, 1, 1, 7);
		RTailSeg1.setTextureSize(128, 64);
		RTailSeg1.mirror = true;
		setRotation(RTailSeg1, 0.1487144F, 0F, 0F);
		PixelmonModelRenderer RTailSeg2 = new PixelmonModelRenderer(this, 42,
				56);
		RTailSeg2.addBox(-0.5F, 0F, 0F, 1, 1, 7);
		RTailSeg2.setTextureSize(128, 64);
		RTailSeg2.mirror = true;
		setRotation(RTailSeg2, 0.3717861F, 0F, 0F);
		PixelmonModelRenderer RTailSeg3 = new PixelmonModelRenderer(this, 42,
				56);
		RTailSeg3.addBox(-0.5F, -0.6F, -0.5F, 1, 1, 7);
		RTailSeg3.setTextureSize(128, 64);
		RTailSeg3.mirror = true;
		setRotation(RTailSeg3, 0.1745329F, 0F, 0F);
		PixelmonModelRenderer RTailWhip = new PixelmonModelRenderer(this, 51,
				60);
		RTailWhip.addBox(-1F, -0.7F, 0F, 2, 1, 2);
		RTailWhip.setRotationPoint(0, -1, 5.9F);
		RTailWhip.setTextureSize(128, 64);
		RTailWhip.mirror = true;
		setRotation(RTailWhip, 0.2617994F, 0F, 0F);

		TailM = new PixelmonModelRenderer(this, "Tail Left");
		TailM.setRotationPoint(0, 0, 17);
		TailM2 = new PixelmonModelRenderer(this, "Tail Left2");
		TailM2.setRotationPoint(-0.5F, -2.3F, 6);
		TailM3 = new PixelmonModelRenderer(this, "Tail Left3");
		TailM3.setRotationPoint(0.5F, -4.5F, 5);
		PixelmonModelRenderer MidTailSeg3 = new PixelmonModelRenderer(this, 42,
				56);
		MidTailSeg3.addBox(-0.5F, -0.4F, 0F, 1, 1, 7);
		MidTailSeg3.setTextureSize(128, 64);
		MidTailSeg3.mirror = true;
		setRotation(MidTailSeg3, 0.1745329F, 0F, 0F);
		PixelmonModelRenderer MidTailWhipFlat = new PixelmonModelRenderer(this,
				47, 56);
		MidTailWhipFlat.addBox(-1.5F, 0.1F, 0F, 3, 0, 4);
		MidTailWhipFlat.setRotationPoint(0, -1.2F, 6.7F);
		MidTailWhipFlat.setTextureSize(128, 64);
		MidTailWhipFlat.mirror = true;
		setRotation(MidTailWhipFlat, 0F, 0F, 0F);
		PixelmonModelRenderer MidTailWhip = new PixelmonModelRenderer(this, 51,
				60);
		MidTailWhip.addBox(-1F, -0.4F, 0F, 2, 1, 2);
		MidTailWhip.setRotationPoint(0, -1.2F, 6.7F);
		MidTailWhip.setTextureSize(128, 64);
		MidTailWhip.mirror = true;
		setRotation(MidTailWhip, 0F, 0F, 0F);
		PixelmonModelRenderer MidTailSeg2 = new PixelmonModelRenderer(this, 42,
				56);
		MidTailSeg2.addBox(0F, 0F, 0F, 1, 1, 7);
		MidTailSeg2.setTextureSize(128, 64);
		MidTailSeg2.mirror = true;
		setRotation(MidTailSeg2, 0.7807508F, 0F, 0F);
		PixelmonModelRenderer MidTailSeg1 = new PixelmonModelRenderer(this, 42,
				56);
		MidTailSeg1.addBox(-0.5F, 0F, 0F, 1, 1, 7);
		MidTailSeg1.setTextureSize(128, 64);
		MidTailSeg1.mirror = true;
		setRotation(MidTailSeg1, 0.3717861F, 0F, 0F);
		TailL.addChild(LTailSeg1);
		TailL2.addChild(LTailSeg2);
		TailL3.addChild(LTailSeg3);
		TailL3.addChild(LTailWhipFlat);
		TailL3.addChild(LTailWhip);
		TailR.addChild(RTailSeg1);
		TailR2.addChild(RTailSeg2);
		TailR3.addChild(RTailSeg3);
		TailR3.addChild(RTailWhip);
		TailR3.addChild(RTailWhipFlat);
		TailM.addChild(MidTailSeg1);
		TailM2.addChild(MidTailSeg2);
		TailM3.addChild(MidTailSeg3);
		TailM3.addChild(MidTailWhipFlat);
		TailM3.addChild(MidTailWhip);
		TailL.addChild(TailL2);
		TailL2.addChild(TailL3);
		TailR.addChild(TailR2);
		TailR2.addChild(TailR3);
		TailM.addChild(TailM2);
		TailM2.addChild(TailM3);

		PixelmonModelRenderer FLLeg = new PixelmonModelRenderer(this,
				"Front Left Leg");
		FLLeg.setRotationPoint(4, 4, -6);
		PixelmonModelRenderer LFrontThighFill1 = new PixelmonModelRenderer(
				this, 0, 0);
		LFrontThighFill1.addBox(0.1F, -0.8F, -1.9F, 2, 8, 2);
		LFrontThighFill1.setTextureSize(128, 64);
		LFrontThighFill1.mirror = true;
		setRotation(LFrontThighFill1, 0F, 0F, 0F);
		PixelmonModelRenderer LFrontThighFill2 = new PixelmonModelRenderer(
				this, 0, 0);
		LFrontThighFill2.addBox(0.1F, -2.1F, -2F, 2, 2, 5);
		LFrontThighFill2.setTextureSize(128, 64);
		LFrontThighFill2.mirror = true;
		setRotation(LFrontThighFill2, -0.296706F, 0F, 0F);
		PixelmonModelRenderer LFrontThighFill3 = new PixelmonModelRenderer(
				this, 0, 0);
		LFrontThighFill3.addBox(0.1F, -3.1F, -1.5F, 2, 1, 4);
		LFrontThighFill3.setTextureSize(128, 64);
		LFrontThighFill3.mirror = true;
		setRotation(LFrontThighFill3, -0.296706F, 0F, 0F);
		PixelmonModelRenderer LFrontHoof = new PixelmonModelRenderer(this, 33,
				60);
		LFrontHoof.addBox(-0.1F, 10F, -1.6F, 2, 2, 2);
		LFrontHoof.setTextureSize(128, 64);
		LFrontHoof.mirror = true;
		setRotation(LFrontHoof, 0F, 0F, 0F);
		PixelmonModelRenderer LFrontThighInner = new PixelmonModelRenderer(
				this, 0, 0);
		LFrontThighInner.addBox(-1.8F, 0F, 0F, 2, 7, 3);
		LFrontThighInner.setTextureSize(128, 64);
		LFrontThighInner.mirror = true;
		setRotation(LFrontThighInner, -0.2676412F, -0.0523599F, -0.2094395F);
		PixelmonModelRenderer LFrontThighOuter = new PixelmonModelRenderer(
				this, 0, 0);
		LFrontThighOuter.addBox(0.1F, -1F, 0F, 2, 8, 3);
		LFrontThighOuter.setTextureSize(128, 64);
		LFrontThighOuter.mirror = true;
		setRotation(LFrontThighOuter, -0.2676412F, 0F, 0F);
		PixelmonModelRenderer LFrontCalf = new PixelmonModelRenderer(this, 0, 0);
		LFrontCalf.addBox(-0.1F, 6F, -1.3F, 2, 4, 2);
		LFrontCalf.setTextureSize(128, 64);
		LFrontCalf.mirror = true;
		setRotation(LFrontCalf, 0F, 0F, 0F);
		FLLeg.addChild(LFrontThighFill1);
		FLLeg.addChild(LFrontThighFill2);
		FLLeg.addChild(LFrontThighFill3);
		FLLeg.addChild(LFrontHoof);
		FLLeg.addChild(LFrontThighInner);
		FLLeg.addChild(LFrontThighOuter);
		FLLeg.addChild(LFrontCalf);

		PixelmonModelRenderer FRLeg = new PixelmonModelRenderer(this,
				"Front Right Leg");
		FRLeg.setRotationPoint(-4, 4, -6);
		PixelmonModelRenderer RFrontHoof = new PixelmonModelRenderer(this, 33,
				60);
		RFrontHoof.addBox(-1.9F, 10F, -1.6F, 2, 2, 2);
		RFrontHoof.setTextureSize(128, 64);
		RFrontHoof.mirror = true;
		setRotation(RFrontHoof, 0F, 0F, 0F);
		PixelmonModelRenderer RFrontThighFill3 = new PixelmonModelRenderer(
				this, 0, 0);
		RFrontThighFill3.addBox(-2.1F, -3.1F, -1.5F, 2, 1, 4);
		RFrontThighFill3.setTextureSize(128, 64);
		RFrontThighFill3.mirror = true;
		setRotation(RFrontThighFill3, -0.296706F, 0F, 0F);
		PixelmonModelRenderer RFrontThighFill1 = new PixelmonModelRenderer(
				this, 0, 0);
		RFrontThighFill1.addBox(-2.1F, -0.8F, -1.9F, 2, 8, 2);
		RFrontThighFill1.setTextureSize(128, 64);
		RFrontThighFill1.mirror = true;
		setRotation(RFrontThighFill1, 0F, 0F, 0F);
		PixelmonModelRenderer RFrontCalf = new PixelmonModelRenderer(this, 0, 0);
		RFrontCalf.addBox(-1.9F, 6F, -1.3F, 2, 4, 2);
		RFrontCalf.setTextureSize(128, 64);
		RFrontCalf.mirror = true;
		setRotation(RFrontCalf, 0F, 0F, 0F);
		PixelmonModelRenderer RFrontThighInner = new PixelmonModelRenderer(
				this, 0, 0);
		RFrontThighInner.addBox(-0.1F, 0F, 0F, 2, 7, 3);
		RFrontThighInner.setTextureSize(128, 64);
		RFrontThighInner.mirror = true;
		setRotation(RFrontThighInner, -0.2676412F, 0.0523599F, 0.2094395F);
		PixelmonModelRenderer RFrontThighOuter = new PixelmonModelRenderer(
				this, 0, 0);
		RFrontThighOuter.addBox(-2.1F, -1F, 0F, 2, 8, 3);
		RFrontThighOuter.setTextureSize(128, 64);
		RFrontThighOuter.mirror = true;
		setRotation(RFrontThighOuter, -0.2676412F, 0F, 0F);
		PixelmonModelRenderer RFrontThighFill2 = new PixelmonModelRenderer(
				this, 0, 0);
		RFrontThighFill2.addBox(-2.1F, -2.1F, -2F, 2, 2, 5);
		RFrontThighFill2.setTextureSize(128, 64);
		RFrontThighFill2.mirror = true;
		setRotation(RFrontThighFill2, -0.296706F, 0F, 0F);
		FRLeg.addChild(RFrontHoof);
		FRLeg.addChild(RFrontThighFill3);
		FRLeg.addChild(RFrontThighFill1);
		FRLeg.addChild(RFrontCalf);
		FRLeg.addChild(RFrontThighInner);
		FRLeg.addChild(RFrontThighOuter);
		FRLeg.addChild(RFrontThighFill2);

		PixelmonModelRenderer BRLeg = new PixelmonModelRenderer(this,
				"Back Right Leg");
		BRLeg.setRotationPoint(-5, -1, 15);
		PixelmonModelRenderer HipRAngle = new PixelmonModelRenderer(this, 0, 0);
		HipRAngle.addBox(-1.4F, -2F, -3F, 2, 2, 5);
		HipRAngle.setTextureSize(128, 64);
		HipRAngle.mirror = true;
		setRotation(HipRAngle, 0.1570796F, -0.1047198F, 0.7853982F);
		PixelmonModelRenderer HipR = new PixelmonModelRenderer(this, 0, 0);
		HipR.addBox(-1F, -1F, -3F, 2, 6, 5);
		HipR.setTextureSize(128, 64);
		HipR.mirror = true;
		setRotation(HipR, 0.1135515F, 0F, 0F);
		PixelmonModelRenderer ThighBackR = new PixelmonModelRenderer(this, 0, 0);
		ThighBackR.addBox(-0.4F, 5F, -2F, 2, 6, 3);
		ThighBackR.setTextureSize(128, 64);
		ThighBackR.mirror = true;
		setRotation(ThighBackR, 0.1135515F, 0F, 0.0872665F);
		PixelmonModelRenderer ThighBackRInner = new PixelmonModelRenderer(this,
				0, 0);
		ThighBackRInner.addBox(2.6F, 3.7F, -2F, 2, 7, 3);
		ThighBackRInner.setTextureSize(128, 64);
		ThighBackRInner.mirror = true;
		setRotation(ThighBackRInner, 0.1135515F, -0.0174533F, 0.3490659F);
		PixelmonModelRenderer CalfBackR = new PixelmonModelRenderer(this, 0, 0);
		CalfBackR.addBox(-0.7F, 10F, 2.5F, 2, 5, 2);
		CalfBackR.setTextureSize(128, 64);
		CalfBackR.mirror = true;
		setRotation(CalfBackR, -0.2268928F, 0F, 0.0523599F);
		PixelmonModelRenderer BackRightHoof = new PixelmonModelRenderer(this,
				32, 59);
		BackRightHoof.addBox(-1.6F, 15F, -2F, 2, 2, 3);
		BackRightHoof.setTextureSize(128, 64);
		BackRightHoof.mirror = true;
		setRotation(BackRightHoof, 0F, 0F, 0F);
		BRLeg.addChild(HipRAngle);
		BRLeg.addChild(HipR);
		BRLeg.addChild(ThighBackR);
		BRLeg.addChild(ThighBackRInner);
		BRLeg.addChild(CalfBackR);
		BRLeg.addChild(BackRightHoof);

		PixelmonModelRenderer BLLeg = new PixelmonModelRenderer(this,
				"Back Left Leg");
		BLLeg.setRotationPoint(5, -1, 15);
		PixelmonModelRenderer BackLeftHoof = new PixelmonModelRenderer(this,
				32, 59);
		BackLeftHoof.addBox(-0.4F, 15F, -2F, 2, 2, 3);
		BackLeftHoof.setTextureSize(128, 64);
		BackLeftHoof.mirror = true;
		setRotation(BackLeftHoof, 0F, 0F, 0F);
		PixelmonModelRenderer CalfBackLeft = new PixelmonModelRenderer(this, 0,
				0);
		CalfBackLeft.addBox(-1.3F, 10F, 2.5F, 2, 5, 2);
		CalfBackLeft.setTextureSize(128, 64);
		CalfBackLeft.mirror = true;
		setRotation(CalfBackLeft, -0.2268928F, 0F, -0.0523599F);
		PixelmonModelRenderer ThighBackL = new PixelmonModelRenderer(this, 0, 0);
		ThighBackL.addBox(-1.6F, 5F, -2F, 2, 6, 3);
		ThighBackL.setTextureSize(128, 64);
		ThighBackL.mirror = true;
		setRotation(ThighBackL, 0.1135515F, 0F, -0.0872665F);
		PixelmonModelRenderer ThighBackLInner = new PixelmonModelRenderer(this,
				0, 0);
		ThighBackLInner.addBox(-4.6F, 3.7F, -2F, 2, 7, 3);
		ThighBackLInner.setTextureSize(128, 64);
		ThighBackLInner.mirror = true;
		setRotation(ThighBackLInner, 0.1135515F, 0.0174533F, -0.3490659F);
		PixelmonModelRenderer HipL = new PixelmonModelRenderer(this, 0, 0);
		HipL.addBox(-1F, -1F, -3F, 2, 6, 5);
		HipL.setTextureSize(128, 64);
		HipL.mirror = true;
		setRotation(HipL, 0.1135515F, 0F, 0F);
		PixelmonModelRenderer HipLAngle = new PixelmonModelRenderer(this, 0, 0);
		HipLAngle.addBox(-0.6F, -2F, -3F, 2, 2, 5);
		HipLAngle.setTextureSize(128, 64);
		HipLAngle.mirror = true;
		setRotation(HipLAngle, 0.1570796F, 0.1047198F, -0.7853982F);
		BLLeg.addChild(BackLeftHoof);
		BLLeg.addChild(CalfBackLeft);
		BLLeg.addChild(ThighBackL);
		BLLeg.addChild(ThighBackLInner);
		BLLeg.addChild(HipL);
		BLLeg.addChild(HipLAngle);

		Body.addChild(Head);
		Body.addChild(FLLeg);
		Body.addChild(FRLeg);
		Body.addChild(BRLeg);
		Body.addChild(BLLeg);
		Body.addChild(TailL);
		Body.addChild(TailM);
		Body.addChild(TailR);

		ModuleHead headModule = new ModuleHead(Head);

		float legspeed = 0.8F;
		float legRotationLimit = 1.1F;

		ModuleLeg frontlegLModule = new ModuleLeg(FLLeg, EnumLeg.FrontLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg frontlegRModule = new ModuleLeg(FRLeg, EnumLeg.FrontRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegLModule = new ModuleLeg(BLLeg, EnumLeg.BackLeft,
				EnumPhase.OutPhase, legRotationLimit, legspeed);
		ModuleLeg backlegRModule = new ModuleLeg(BRLeg, EnumLeg.BackRight,
				EnumPhase.OutPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonQuadruped(Body, headModule, frontlegLModule,
				frontlegRModule, backlegLModule, backlegRModule);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5) {

		TailM2.rotateAngleX = MathHelper.cos(f2 * .1F + 1F) * .5F;
		TailM3.rotateAngleX = -MathHelper.cos(f2 * .1F + 1F) * .25F;

		TailL.rotateAngleX = MathHelper.cos(f2 * .2F + 1F) * .25F;
		TailL2.rotateAngleX = -MathHelper.cos(f2 * .1F + 1F) * .5F;
		TailL3.rotateAngleX = MathHelper.cos(f2 * .1F + 1F) * .75F;

		TailR.rotateAngleX = -MathHelper.cos(f2 * .2F + 1F) * .25F;
		TailR2.rotateAngleX = -MathHelper.cos(f2 * .1F + 1F) * .5F;
		TailR3.rotateAngleX = -MathHelper.cos(f2 * .1F + 1F) * .25F;

	}

}
