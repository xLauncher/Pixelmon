// Date: 2/4/2013 2:38:10 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.Bird.EnumWing;
import pixelmon.client.models.animations.Bird.ModuleWing;
import pixelmon.client.models.animations.Bird.ModuleWingComplex;
import pixelmon.client.models.animations.Bird.SkeletonBird;

public class ModelAerodactyl extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;
	PixelmonModelRenderer RightWing;
	PixelmonModelRenderer LeftWing;

	public ModelAerodactyl() {
		textureWidth = 512;
		textureHeight = 64;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 0, 0);
		PixelmonModelRenderer Torso = new PixelmonModelRenderer(this, 124, 0);
		Torso.addBox(-5F, 0F, 0F, 10, 19, 9);
		Torso.setTextureSize(512, 64);
		Torso.mirror = true;
		setRotation(Torso, 1.22173F, 0F, 0F);
		Body.addChild(Torso);
		PixelmonModelRenderer Back_Spike = new PixelmonModelRenderer(this, 162,
				0);
		Back_Spike.addBox(-2F, 4F, 10F, 4, 6, 3);
		Back_Spike.setTextureSize(512, 64);
		Back_Spike.mirror = true;
		setRotation(Back_Spike, 0.9599311F, 0F, 0F);
		Body.addChild(Back_Spike);
		PixelmonModelRenderer Back_Spike_2 = new PixelmonModelRenderer(this,
				165, 9);
		Back_Spike_2.addBox(-1F, 1F, 13F, 2, 1, 2);
		Back_Spike_2.setTextureSize(512, 64);
		Back_Spike_2.mirror = true;
		setRotation(Back_Spike_2, 0.7853982F, 0F, 0F);
		Body.addChild(Back_Spike_2);
		PixelmonModelRenderer Back_Spike_3 = new PixelmonModelRenderer(this,
				162, 12);
		Back_Spike_3.addBox(-2F, 8F, 3F, 4, 6, 2);
		Back_Spike_3.setTextureSize(512, 64);
		Back_Spike_3.mirror = true;
		setRotation(Back_Spike_3, 1.919862F, 0F, 0F);
		Body.addChild(Back_Spike_3);
		PixelmonModelRenderer Stomach_Helper_2 = new PixelmonModelRenderer(
				this, 124, 28);
		Stomach_Helper_2.addBox(-4F, 14F, -8F, 8, 2, 1);
		Stomach_Helper_2.setTextureSize(512, 64);
		Stomach_Helper_2.mirror = true;
		setRotation(Stomach_Helper_2, 1.745329F, 0F, 0F);
		Body.addChild(Stomach_Helper_2);
		PixelmonModelRenderer Stomach_Rounder = new PixelmonModelRenderer(this,
				124, 31);
		Stomach_Rounder.addBox(-4F, 5F, 0F, 8, 12, 1);
		Stomach_Rounder.setTextureSize(512, 64);
		Stomach_Rounder.mirror = true;
		setRotation(Stomach_Rounder, 1.22173F, 0F, 0F);
		Body.addChild(Stomach_Rounder);
		PixelmonModelRenderer Stomach_Helper = new PixelmonModelRenderer(this,
				124, 44);
		Stomach_Helper.addBox(-4F, 3F, 2F, 8, 2, 1);
		Stomach_Helper.setTextureSize(512, 64);
		Stomach_Helper.mirror = true;
		setRotation(Stomach_Helper, 0.8203047F, 0F, 0F);
		Body.addChild(Stomach_Helper);
		PixelmonModelRenderer Side_Rounder = new PixelmonModelRenderer(this,
				142, 28);
		Side_Rounder.addBox(-6F, 3F, 4F, 12, 13, 3);
		Side_Rounder.setTextureSize(512, 64);
		Side_Rounder.mirror = true;
		setRotation(Side_Rounder, 1.22173F, 0F, 0F);
		Body.addChild(Side_Rounder);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -6, 3);
		PixelmonModelRenderer Lower_Lip = new PixelmonModelRenderer(this, 50,
				61);
		Lower_Lip.addBox(-3F, -5F, -16F, 6, 2, 1);
		Lower_Lip.setTextureSize(512, 64);
		Lower_Lip.mirror = true;
		setRotation(Lower_Lip, 0.5235988F, 0F, 0F);
		Head.addChild(Lower_Lip);
		PixelmonModelRenderer Bottom_Mouth = new PixelmonModelRenderer(this,
				40, 48);
		Bottom_Mouth.addBox(-3F, -4F, -16F, 6, 2, 11);
		Bottom_Mouth.setTextureSize(512, 64);
		Bottom_Mouth.mirror = true;
		setRotation(Bottom_Mouth, 0.4886922F, 0F, 0F);
		Head.addChild(Bottom_Mouth);
		PixelmonModelRenderer Chin = new PixelmonModelRenderer(this, 48, 40);
		Chin.addBox(-2F, -2F, -11F, 4, 2, 6);
		Chin.setTextureSize(512, 64);
		Chin.mirror = true;
		setRotation(Chin, 0.3316126F, 0F, 0F);
		Head.addChild(Chin);
		PixelmonModelRenderer Mouth_Back = new PixelmonModelRenderer(this, 52,
				34);
		Mouth_Back.addBox(-2F, -2F, -9F, 4, 5, 1);
		Mouth_Back.setTextureSize(512, 64);
		Mouth_Back.mirror = true;
		setRotation(Mouth_Back, -0.0872665F, 0F, 0F);
		Head.addChild(Mouth_Back);
		PixelmonModelRenderer Side_Lip = new PixelmonModelRenderer(this, 24, 40);
		Side_Lip.addBox(5F, -3F, 2F, 11, 2, 1);
		Side_Lip.setTextureSize(512, 64);
		Side_Lip.mirror = true;
		setRotation(Side_Lip, 0F, 1.570796F, 0.418879F);
		Head.addChild(Side_Lip);
		PixelmonModelRenderer Side_Lip_2 = new PixelmonModelRenderer(this, 68,
				40);
		Side_Lip_2.addBox(5F, -3F, -3F, 11, 2, 1);
		Side_Lip_2.setTextureSize(512, 64);
		Side_Lip_2.mirror = true;
		setRotation(Side_Lip_2, 0F, 1.58825F, 0.4014257F);
		Head.addChild(Side_Lip_2);
		PixelmonModelRenderer Tongue = new PixelmonModelRenderer(this, 6, 0);
		Tongue.addBox(-1F, -4.2F, -14F, 2, 1, 6);
		Tongue.setTextureSize(512, 64);
		Tongue.mirror = true;
		setRotation(Tongue, 0.4886922F, 0F, 0F);
		Head.addChild(Tongue);
		PixelmonModelRenderer Tongue2 = new PixelmonModelRenderer(this, 6, 0);
		Tongue2.addBox(-0.5F, -4.2F, -14.46667F, 1, 1, 2);
		Tongue2.setTextureSize(512, 64);
		Tongue2.mirror = true;
		setRotation(Tongue2, 0.4886922F, 0F, 0F);
		Head.addChild(Tongue2);
		PixelmonModelRenderer Tooth_L1 = new PixelmonModelRenderer(this, 46, 43);
		Tooth_L1.addBox(-2F, 1F, -11F, 0, 1, 1);
		Tooth_L1.setTextureSize(512, 64);
		Tooth_L1.mirror = true;
		setRotation(Tooth_L1, -0.0174533F, 0F, 0F);
		Head.addChild(Tooth_L1);
		PixelmonModelRenderer Tooth_L2 = new PixelmonModelRenderer(this, 44, 43);
		Tooth_L2.addBox(-2F, 2F, -11F, 0, 1, 1);
		Tooth_L2.setTextureSize(512, 64);
		Tooth_L2.mirror = true;
		setRotation(Tooth_L2, -0.0698132F, 0F, 0F);
		Head.addChild(Tooth_L2);
		PixelmonModelRenderer Tooth_L3 = new PixelmonModelRenderer(this, 42, 43);
		Tooth_L3.addBox(-2F, 4F, -12F, 0, 1, 1);
		Tooth_L3.setTextureSize(512, 64);
		Tooth_L3.mirror = true;
		setRotation(Tooth_L3, -0.1919862F, 0F, 0F);
		Head.addChild(Tooth_L3);
		PixelmonModelRenderer Tooth_L4 = new PixelmonModelRenderer(this, 40, 43);
		Tooth_L4.addBox(-2F, 0.5F, -12F, 0, 1, 1);
		Tooth_L4.setTextureSize(512, 64);
		Tooth_L4.mirror = true;
		setRotation(Tooth_L4, 0.0698132F, 0F, 0F);
		Head.addChild(Tooth_L4);
		PixelmonModelRenderer Tooth_L5 = new PixelmonModelRenderer(this, 38, 43);
		Tooth_L5.addBox(-2F, 3.5F, -13F, 0, 1, 1);
		Tooth_L5.setTextureSize(512, 64);
		Tooth_L5.mirror = true;
		setRotation(Tooth_L5, -0.122173F, -0.0174533F, 0F);
		Head.addChild(Tooth_L5);
		PixelmonModelRenderer Tooth_L6 = new PixelmonModelRenderer(this, 36, 43);
		Tooth_L6.addBox(-2F, 5F, -14F, 0, 1, 1);
		Tooth_L6.setTextureSize(512, 64);
		Tooth_L6.mirror = true;
		setRotation(Tooth_L6, -0.1745329F, -0.0174533F, 0F);
		Head.addChild(Tooth_L6);
		PixelmonModelRenderer Tooth_L7 = new PixelmonModelRenderer(this, 34, 43);
		Tooth_L7.addBox(-2F, 4.5F, -15F, 0, 1, 1);
		Tooth_L7.setTextureSize(512, 64);
		Tooth_L7.mirror = true;
		setRotation(Tooth_L7, -0.1047198F, -0.0523599F, 0F);
		Head.addChild(Tooth_L7);
		PixelmonModelRenderer Tooth_R1 = new PixelmonModelRenderer(this, 68, 43);
		Tooth_R1.addBox(2F, 1F, -11F, 0, 1, 1);
		Tooth_R1.setTextureSize(512, 64);
		Tooth_R1.mirror = true;
		setRotation(Tooth_R1, -0.0174533F, 0F, 0F);
		Head.addChild(Tooth_R1);
		PixelmonModelRenderer Tooth_R4 = new PixelmonModelRenderer(this, 70, 43);
		Tooth_R4.addBox(2F, 1F, -13F, 0, 1, 1);
		Tooth_R4.setTextureSize(512, 64);
		Tooth_R4.mirror = true;
		setRotation(Tooth_R4, 0.0698132F, 0F, 0F);
		Head.addChild(Tooth_R4);
		PixelmonModelRenderer Tooth_R2 = new PixelmonModelRenderer(this, 72, 43);
		Tooth_R2.addBox(2F, 2F, -12F, 0, 1, 1);
		Tooth_R2.setTextureSize(512, 64);
		Tooth_R2.mirror = true;
		setRotation(Tooth_R2, -0.0698132F, 0F, 0F);
		Head.addChild(Tooth_R2);
		PixelmonModelRenderer Tooth_R3 = new PixelmonModelRenderer(this, 74, 43);
		Tooth_R3.addBox(2F, 4F, -12F, 0, 1, 1);
		Tooth_R3.setTextureSize(512, 64);
		Tooth_R3.mirror = true;
		setRotation(Tooth_R3, -0.1919862F, 0F, 0F);
		Head.addChild(Tooth_R3);
		PixelmonModelRenderer Tooth_R5 = new PixelmonModelRenderer(this, 76, 43);
		Tooth_R5.addBox(2F, 3.7F, -13.2F, 0, 1, 1);
		Tooth_R5.setTextureSize(512, 64);
		Tooth_R5.mirror = true;
		setRotation(Tooth_R5, -0.122173F, 0.0174533F, 0F);
		Head.addChild(Tooth_R5);
		PixelmonModelRenderer Tooth_R6 = new PixelmonModelRenderer(this, 78, 43);
		Tooth_R6.addBox(2F, 5F, -14F, 0, 1, 1);
		Tooth_R6.setTextureSize(512, 64);
		Tooth_R6.mirror = true;
		setRotation(Tooth_R6, -0.1745329F, 0.0174533F, 0F);
		Head.addChild(Tooth_R6);
		PixelmonModelRenderer Tooth_R7 = new PixelmonModelRenderer(this, 80, 43);
		Tooth_R7.addBox(2F, 4.5F, -15F, 0, 1, 1);
		Tooth_R7.setTextureSize(512, 64);
		Tooth_R7.mirror = true;
		setRotation(Tooth_R7, -0.1047198F, 0.0523599F, 0F);
		Head.addChild(Tooth_R7);
		PixelmonModelRenderer Horn_1 = new PixelmonModelRenderer(this, 64, 0);
		Horn_1.addBox(-5F, -5F, -8F, 1, 6, 1);
		Horn_1.setTextureSize(512, 64);
		Horn_1.mirror = true;
		setRotation(Horn_1, -0.9599311F, -0.4363323F, 0F);
		Head.addChild(Horn_1);
		PixelmonModelRenderer Horn_2 = new PixelmonModelRenderer(this, 46, 0);
		Horn_2.addBox(4F, -5F, -8F, 1, 6, 1);
		Horn_2.setTextureSize(512, 64);
		Horn_2.mirror = true;
		setRotation(Horn_2, -0.9599311F, 0.4363323F, 0F);
		Head.addChild(Horn_2);
		PixelmonModelRenderer Lower_Skull = new PixelmonModelRenderer(this, 47,
				10);
		Lower_Skull.addBox(-3F, 3F, -4F, 6, 7, 4);
		Lower_Skull.setTextureSize(512, 64);
		Lower_Skull.mirror = true;
		setRotation(Lower_Skull, -1.832596F, 0F, 0F);
		Head.addChild(Lower_Skull);
		PixelmonModelRenderer Upper_Skull = new PixelmonModelRenderer(this, 50,
				0);
		Upper_Skull.addBox(-2F, 3F, -6F, 4, 7, 3);
		Upper_Skull.setTextureSize(512, 64);
		Upper_Skull.mirror = true;
		setRotation(Upper_Skull, -1.53589F, 0F, 0F);
		Head.addChild(Upper_Skull);
		PixelmonModelRenderer Eyebrow_R = new PixelmonModelRenderer(this, 0, 0);
		Eyebrow_R.addBox(-3.1F, -6F, -8F, 1, 1, 2);
		Eyebrow_R.setTextureSize(512, 64);
		Eyebrow_R.mirror = true;
		setRotation(Eyebrow_R, 0.0523599F, 0F, 0F);
		Head.addChild(Eyebrow_R);
		PixelmonModelRenderer Eyebrow_L = new PixelmonModelRenderer(this, 0, 0);
		Eyebrow_L.addBox(2.1F, -6F, -8F, 1, 1, 2);
		Eyebrow_L.setTextureSize(512, 64);
		Eyebrow_L.mirror = true;
		setRotation(Eyebrow_L, 0.0523599F, 0F, 0F);
		Head.addChild(Eyebrow_L);
		PixelmonModelRenderer Upper_Lip = new PixelmonModelRenderer(this, 42,
				21);
		Upper_Lip.addBox(-2F, 1F, -17F, 4, 2, 11);
		Upper_Lip.setTextureSize(512, 64);
		Upper_Lip.mirror = true;
		setRotation(Upper_Lip, -0.4014257F, 0F, 0F);
		Head.addChild(Upper_Lip);
		PixelmonModelRenderer Snout = new PixelmonModelRenderer(this, 30, 30);
		Snout.addBox(-2F, 1F, -18F, 4, 2, 2);
		Snout.setTextureSize(512, 64);
		Snout.mirror = true;
		setRotation(Snout, -0.3665191F, 0F, 0F);
		Head.addChild(Snout);
		PixelmonModelRenderer Nose_Bridge = new PixelmonModelRenderer(this, 72,
				22);
		Nose_Bridge.addBox(-1F, 0.5F, -17F, 2, 1, 11);
		Nose_Bridge.setTextureSize(512, 64);
		Nose_Bridge.mirror = true;
		setRotation(Nose_Bridge, -0.3839724F, 0F, 0F);
		Head.addChild(Nose_Bridge);
		PixelmonModelRenderer Lower_Neck = new PixelmonModelRenderer(this, 0,
				14);
		Lower_Neck.addBox(-2F, 0F, -8F, 4, 3, 10);
		Lower_Neck.setTextureSize(512, 64);
		Lower_Neck.mirror = true;
		setRotation(Lower_Neck, -0.6806784F, 0F, 0F);
		Head.addChild(Lower_Neck);
		PixelmonModelRenderer Upper_Neck = new PixelmonModelRenderer(this, 0,
				27);
		Upper_Neck.addBox(-2F, -1F, -8F, 4, 3, 10);
		Upper_Neck.setTextureSize(512, 64);
		Upper_Neck.mirror = true;
		setRotation(Upper_Neck, -0.296706F, 0F, 0F);
		Head.addChild(Upper_Neck);
		Body.addChild(Head);

		LeftWing = new PixelmonModelRenderer(this, "Left Wing");
		LeftWing.setRotationPoint(4, -8, 4);
		PixelmonModelRenderer First_Left_Wing_Bone = new PixelmonModelRenderer(
				this, 219, 23);
		First_Left_Wing_Bone.addBox(-1F, 0F, 0F, 1, 10, 1);
		First_Left_Wing_Bone.setTextureSize(512, 64);
		First_Left_Wing_Bone.mirror = true;
		setRotation(First_Left_Wing_Bone, 0.0349066F, 0F, -1.570796F);
		LeftWing.addChild(First_Left_Wing_Bone);
		PixelmonModelRenderer First_Left_Folds = new PixelmonModelRenderer(
				this, 178, 33);
		First_Left_Folds.addBox(-8F, 1F, 1F, 7, 0, 12);
		First_Left_Folds.setTextureSize(512, 64);
		First_Left_Folds.mirror = true;
		setRotation(First_Left_Folds, 0F, 1.570796F, 0F);
		LeftWing.addChild(First_Left_Folds);
		PixelmonModelRenderer Second_Left_Wing_Bone = new PixelmonModelRenderer(
				this, 224, 24);
		Second_Left_Wing_Bone.addBox(6.5F, 0F, -15.5F, 1, 1, 9);
		Second_Left_Wing_Bone.setTextureSize(512, 64);
		Second_Left_Wing_Bone.mirror = true;
		setRotation(Second_Left_Wing_Bone, 0F, -0.8726646F, 0F);
		LeftWing.addChild(Second_Left_Wing_Bone);
		PixelmonModelRenderer Second_Left_Folds = new PixelmonModelRenderer(
				this, 216, 34);
		Second_Left_Folds.addBox(7F, 1F, -16F, 7, 0, 11);
		Second_Left_Folds.setTextureSize(512, 64);
		Second_Left_Folds.mirror = true;
		setRotation(Second_Left_Folds, 0F, -0.8726646F, 0F);
		LeftWing.addChild(Second_Left_Folds);
		PixelmonModelRenderer _Left_Palm = new PixelmonModelRenderer(this, 187,
				45);
		_Left_Palm.addBox(7F, 0F, -16F, 1, 1, 1);
		_Left_Palm.setTextureSize(512, 64);
		_Left_Palm.mirror = true;
		setRotation(_Left_Palm, 0F, -0.837758F, 0F);
		LeftWing.addChild(_Left_Palm);
		PixelmonModelRenderer _Left_Finger = new PixelmonModelRenderer(this,
				183, 45);
		_Left_Finger.addBox(6F, 0F, -16F, 1, 2, 1);
		_Left_Finger.setTextureSize(512, 64);
		_Left_Finger.mirror = true;
		setRotation(_Left_Finger, 0F, -0.8726646F, -0.0349066F);
		LeftWing.addChild(_Left_Finger);
		PixelmonModelRenderer _Left_Finger_2 = new PixelmonModelRenderer(this,
				191, 45);
		_Left_Finger_2.addBox(6F, 1F, -17F, 1, 2, 1);
		_Left_Finger_2.setTextureSize(512, 64);
		_Left_Finger_2.mirror = true;
		setRotation(_Left_Finger_2, -0.0174533F, -0.8726646F, -0.1047198F);
		LeftWing.addChild(_Left_Finger_2);
		PixelmonModelRenderer _Left_Finger_3 = new PixelmonModelRenderer(this,
				187, 47);
		_Left_Finger_3.addBox(7F, 2F, -17F, 1, 2, 1);
		_Left_Finger_3.setTextureSize(512, 64);
		_Left_Finger_3.mirror = true;
		setRotation(_Left_Finger_3, 0F, -0.8552113F, -0.296706F);
		LeftWing.addChild(_Left_Finger_3);
		PixelmonModelRenderer Third_Left_Wing_Bone = new PixelmonModelRenderer(
				this, 243, 23);
		Third_Left_Wing_Bone.addBox(8F, 0F, 15F, 1, 1, 10);
		Third_Left_Wing_Bone.setTextureSize(512, 64);
		Third_Left_Wing_Bone.mirror = true;
		setRotation(Third_Left_Wing_Bone, 0F, 1.308997F, 0F);
		LeftWing.addChild(Third_Left_Wing_Bone);
		PixelmonModelRenderer Third_Left_Folds = new PixelmonModelRenderer(
				this, 252, 34);
		Third_Left_Folds.addBox(3F, 1F, 15F, 6, 0, 11);
		Third_Left_Folds.setTextureSize(512, 64);
		Third_Left_Folds.mirror = true;
		setRotation(Third_Left_Folds, 0F, 1.308997F, 0F);
		LeftWing.addChild(Third_Left_Folds);
		PixelmonModelRenderer Third_Left_Upper_Folds = new PixelmonModelRenderer(
				this, 252, 45);
		Third_Left_Upper_Folds.addBox(3F, 0.9F, 15F, 6, 0, 11);
		Third_Left_Upper_Folds.setTextureSize(512, 64);
		Third_Left_Upper_Folds.mirror = true;
		setRotation(Third_Left_Upper_Folds, 0F, 1.308997F, 0F);
		LeftWing.addChild(Third_Left_Upper_Folds);
		Body.addChild(LeftWing);

		RightWing = new PixelmonModelRenderer(this, "Right Wing");
		RightWing.setRotationPoint(-4, -8, 4);
		PixelmonModelRenderer First_Right_Folds = new PixelmonModelRenderer(
				this, 178, 0);
		First_Right_Folds.addBox(1F, 1F, 1F, 7, 0, 12);
		First_Right_Folds.setTextureSize(512, 64);
		First_Right_Folds.mirror = true;
		setRotation(First_Right_Folds, 0F, -1.570796F, 0F);
		RightWing.addChild(First_Right_Folds);
		PixelmonModelRenderer First_Right_Wing_Bone = new PixelmonModelRenderer(
				this, 176, 12);
		First_Right_Wing_Bone.addBox(0F, 0F, 0F, 1, 10, 1);
		First_Right_Wing_Bone.setTextureSize(512, 64);
		First_Right_Wing_Bone.mirror = true;
		setRotation(First_Right_Wing_Bone, 0.0349066F, 0F, 1.570796F);
		RightWing.addChild(First_Right_Wing_Bone);
		PixelmonModelRenderer Second_Right_Wing_Bone = new PixelmonModelRenderer(
				this, 180, 12);
		Second_Right_Wing_Bone.addBox(-7.5F, 0F, -15.5F, 1, 1, 9);
		Second_Right_Wing_Bone.setTextureSize(512, 64);
		Second_Right_Wing_Bone.mirror = true;
		setRotation(Second_Right_Wing_Bone, 0F, 0.8726646F, 0F);
		RightWing.addChild(Second_Right_Wing_Bone);
		PixelmonModelRenderer Second_Right_Folds = new PixelmonModelRenderer(
				this, 216, 0);
		Second_Right_Folds.addBox(-13.5F, 1F, -15.5F, 7, 0, 11);
		Second_Right_Folds.setTextureSize(512, 64);
		Second_Right_Folds.mirror = true;
		setRotation(Second_Right_Folds, 0F, 0.8726646F, 0F);
		RightWing.addChild(Second_Right_Folds);
		PixelmonModelRenderer Right_Palm = new PixelmonModelRenderer(this, 188,
				22);
		Right_Palm.addBox(-8F, 0F, -16F, 1, 1, 1);
		Right_Palm.setTextureSize(512, 64);
		Right_Palm.mirror = true;
		setRotation(Right_Palm, 0F, 0.837758F, 0F);
		RightWing.addChild(Right_Palm);
		PixelmonModelRenderer Right_Finger = new PixelmonModelRenderer(this,
				184, 22);
		Right_Finger.addBox(-7F, 0.5F, -16F, 1, 2, 1);
		Right_Finger.setTextureSize(512, 64);
		Right_Finger.mirror = true;
		setRotation(Right_Finger, 0F, 0.8726646F, 0.0349066F);
		RightWing.addChild(Right_Finger);
		PixelmonModelRenderer Right_Finger_2 = new PixelmonModelRenderer(this,
				188, 24);
		Right_Finger_2.addBox(-7F, 1.5F, -17F, 1, 2, 1);
		Right_Finger_2.setTextureSize(512, 64);
		Right_Finger_2.mirror = true;
		setRotation(Right_Finger_2, 0F, 0.8726646F, 0.1570796F);
		RightWing.addChild(Right_Finger_2);
		PixelmonModelRenderer Right_Finger_3 = new PixelmonModelRenderer(this,
				192, 22);
		Right_Finger_3.addBox(-7.5F, 2F, -17F, 1, 2, 1);
		Right_Finger_3.setTextureSize(512, 64);
		Right_Finger_3.mirror = true;
		setRotation(Right_Finger_3, 0F, 0.8726646F, 0.296706F);
		RightWing.addChild(Right_Finger_3);
		PixelmonModelRenderer Third_Right_Wing_Bone = new PixelmonModelRenderer(
				this, 200, 12);
		Third_Right_Wing_Bone.addBox(-9F, 0F, 14F, 1, 1, 10);
		Third_Right_Wing_Bone.setTextureSize(512, 64);
		Third_Right_Wing_Bone.mirror = true;
		setRotation(Third_Right_Wing_Bone, 0F, -1.308997F, 0F);
		RightWing.addChild(Third_Right_Wing_Bone);
		PixelmonModelRenderer Third_Right_Folds = new PixelmonModelRenderer(
				this, 252, 34);
		Third_Right_Folds.addBox(-9F, 1F, 14F, 6, 0, 11);
		Third_Right_Folds.setTextureSize(512, 64);
		Third_Right_Folds.mirror = true;
		setRotation(Third_Right_Folds, 0F, -1.308997F, 0F);
		RightWing.addChild(Third_Right_Folds);
		PixelmonModelRenderer Third_Right_Upper_Folds = new PixelmonModelRenderer(
				this, 252, 45);
		Third_Right_Upper_Folds.addBox(-9F, 0.9F, 14F, 6, 0, 11);
		Third_Right_Upper_Folds.setTextureSize(512, 64);
		Third_Right_Upper_Folds.mirror = true;
		setRotation(Third_Right_Upper_Folds, 0F, -1.308997F, 0F);
		RightWing.addChild(Third_Right_Upper_Folds);
		Body.addChild(RightWing);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this,
				"Right Leg");
		RightLeg.setRotationPoint(-4, 3, 17);
		PixelmonModelRenderer Right_Claw_3 = new PixelmonModelRenderer(this,
				365, 18);
		Right_Claw_3.addBox(-1.5F, 7F, 3F, 1, 3, 1);
		Right_Claw_3.setTextureSize(512, 64);
		Right_Claw_3.mirror = true;
		setRotation(Right_Claw_3, -0.6108652F, 0.0872665F, 0.6632251F);
		RightLeg.addChild(Right_Claw_3);
		PixelmonModelRenderer Right_Thigh = new PixelmonModelRenderer(this,
				353, 0);
		Right_Thigh.addBox(-1F, 0F, -2F, 2, 7, 3);
		Right_Thigh.setTextureSize(512, 64);
		Right_Thigh.mirror = true;
		setRotation(Right_Thigh, -0.6108652F, 0F, 0.6981317F);
		RightLeg.addChild(Right_Thigh);
		PixelmonModelRenderer Right_Lower_Leg = new PixelmonModelRenderer(this,
				353, 10);
		Right_Lower_Leg.addBox(-1F, 6F, -2F, 2, 2, 6);
		Right_Lower_Leg.setTextureSize(512, 64);
		Right_Lower_Leg.mirror = true;
		setRotation(Right_Lower_Leg, -0.6108652F, 0F, 0.6981317F);
		RightLeg.addChild(Right_Lower_Leg);
		PixelmonModelRenderer Right_Claw_2 = new PixelmonModelRenderer(this,
				359, 18);
		Right_Claw_2.addBox(0.5F, 7F, 3F, 1, 3, 1);
		Right_Claw_2.setTextureSize(512, 64);
		Right_Claw_2.mirror = true;
		setRotation(Right_Claw_2, -0.6108652F, 0.0872665F, 0.7330383F);
		RightLeg.addChild(Right_Claw_2);
		PixelmonModelRenderer Right_Claw_1 = new PixelmonModelRenderer(this,
				353, 18);
		Right_Claw_1.addBox(-0.5F, 4F, 3F, 1, 3, 1);
		Right_Claw_1.setTextureSize(512, 64);
		Right_Claw_1.mirror = true;
		setRotation(Right_Claw_1, -0.6108652F, 0.0872665F, 0.6981317F);
		RightLeg.addChild(Right_Claw_1);
		Body.addChild(RightLeg);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this,
				"Left Leg");
		LeftLeg.setRotationPoint(4, 3, 17);
		PixelmonModelRenderer Left_Thigh = new PixelmonModelRenderer(this, 316,
				0);
		Left_Thigh.addBox(-1F, 0F, -2F, 2, 7, 3);
		Left_Thigh.setTextureSize(512, 64);
		Left_Thigh.mirror = true;
		setRotation(Left_Thigh, -0.6108652F, 0F, -0.6981317F);
		LeftLeg.addChild(Left_Thigh);
		PixelmonModelRenderer Left_Lower_Leg = new PixelmonModelRenderer(this,
				316, 10);
		Left_Lower_Leg.addBox(-1F, 6F, -2F, 2, 2, 6);
		Left_Lower_Leg.setTextureSize(512, 64);
		Left_Lower_Leg.mirror = true;
		setRotation(Left_Lower_Leg, -0.6108652F, 0F, -0.6981317F);
		LeftLeg.addChild(Left_Lower_Leg);
		PixelmonModelRenderer Left_Claw_1 = new PixelmonModelRenderer(this,
				316, 18);
		Left_Claw_1.addBox(-0.5F, 4F, 3F, 1, 3, 1);
		Left_Claw_1.setTextureSize(512, 64);
		Left_Claw_1.mirror = true;
		setRotation(Left_Claw_1, -0.6108652F, -0.0872665F, -0.6981317F);
		LeftLeg.addChild(Left_Claw_1);
		PixelmonModelRenderer Left_Claw_2 = new PixelmonModelRenderer(this,
				322, 18);
		Left_Claw_2.addBox(0.5F, 7F, 3F, 1, 3, 1);
		Left_Claw_2.setTextureSize(512, 64);
		Left_Claw_2.mirror = true;
		setRotation(Left_Claw_2, -0.6108652F, -0.0872665F, -0.6632251F);
		LeftLeg.addChild(Left_Claw_2);
		PixelmonModelRenderer Left_Claw_3 = new PixelmonModelRenderer(this,
				327, 18);
		Left_Claw_3.addBox(-1.5F, 7F, 3F, 1, 3, 1);
		Left_Claw_3.setTextureSize(512, 64);
		Left_Claw_3.mirror = true;
		setRotation(Left_Claw_3, -0.6108652F, -0.0872665F, -0.7330383F);
		LeftLeg.addChild(Left_Claw_3);
		Body.addChild(LeftLeg);

		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 2, 18);
		PixelmonModelRenderer Segment_1 = new PixelmonModelRenderer(this, 100,
				0);
		Segment_1.addBox(-3F, 0F, -3F, 6, 2, 6);
		Segment_1.setTextureSize(512, 64);
		Segment_1.mirror = true;
		setRotation(Segment_1, 1.22173F, 0F, 0F);
		Tail.addChild(Segment_1);
		PixelmonModelRenderer Segment_2 = new PixelmonModelRenderer(this, 104,
				8);
		Segment_2.addBox(-2F, -1F, -2F, 4, 5, 4);
		Segment_2.setRotationPoint(0F, 2F, 5F);
		Segment_2.setTextureSize(512, 64);
		Segment_2.mirror = true;
		setRotation(Segment_2, 1.169371F, 0F, 0F);
		Tail.addChild(Segment_2);
		PixelmonModelRenderer Segment_3 = new PixelmonModelRenderer(this, 104,
				17);
		Segment_3.addBox(-2F, 1F, -2F, 4, 5, 4);
		Segment_3.setTextureSize(512, 64);
		Segment_3.mirror = true;
		setRotation(Segment_3, 1.22173F, 0F, 0F);
		Tail.addChild(Segment_3);
		PixelmonModelRenderer Segment_4 = new PixelmonModelRenderer(this, 108,
				26);
		Segment_4.addBox(-1F, 0F, -1F, 2, 6, 2);
		Segment_4.setRotationPoint(0F, 3F, 8F);
		Segment_4.setTextureSize(512, 64);
		Segment_4.mirror = true;
		setRotation(Segment_4, 1.22173F, 0F, 0F);
		Tail.addChild(Segment_4);
		PixelmonModelRenderer Segment_5 = new PixelmonModelRenderer(this, 108,
				34);
		Segment_5.addBox(-1F, -1F, -1F, 2, 6, 2);
		Segment_5.setRotationPoint(0F, 5F, 14F);
		Segment_5.setTextureSize(512, 64);
		Segment_5.mirror = true;
		setRotation(Segment_5, 1.396263F, 0F, 0F);
		Tail.addChild(Segment_5);
		PixelmonModelRenderer Segment_6 = new PixelmonModelRenderer(this, 109,
				42);
		Segment_6.addBox(-1F, -1F, -1F, 2, 9, 1);
		Segment_6.setRotationPoint(0F, 6F, 19F);
		Segment_6.setTextureSize(512, 64);
		Segment_6.mirror = true;
		setRotation(Segment_6, 1.396263F, 0F, 0F);
		Tail.addChild(Segment_6);
		PixelmonModelRenderer Segment_7 = new PixelmonModelRenderer(this, 106,
				52);
		Segment_7.addBox(-3F, 6F, -1F, 6, 6, 0);
		Segment_7.setRotationPoint(0F, 6F, 19F);
		Segment_7.setTextureSize(512, 64);
		Segment_7.mirror = true;
		setRotation(Segment_7, 1.396263F, 0F, 0F);
		Tail.addChild(Segment_7);
		Body.addChild(Tail);

		ModuleHead headModule = new ModuleHead(Head);

		float WingSpeed = 0.5F;
		float WingRotationLimit = 0.25F;

//		ModuleWing rightWingModule = new ModuleWing(RightWing, EnumWing.Right,
//				EnumWing.Verticle, WingRotationLimit, WingSpeed);
//		ModuleWing leftWingModule = new ModuleWing(LeftWing, EnumWing.Left,
//				EnumWing.Verticle, WingRotationLimit, WingSpeed);
		
		ModuleWingComplex rightWingModule = new ModuleWingComplex(RightWing, EnumWing.Right,
		WingRotationLimit, WingSpeed);
		ModuleWingComplex leftWingModule = new ModuleWingComplex(LeftWing, EnumWing.Left,
			 WingRotationLimit, WingSpeed);

		skeleton = new SkeletonBird(Body, headModule, leftWingModule,
				rightWingModule, LeftLeg, RightLeg);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	// public void setRotationAngles(float f, float f1, float f2, float f3,
	// float f4, float f5, Entity entity) {
	// super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	//
	// if (((EntityPixelmon)entity).animationCounter2 * 3 - 180 < 0) {
	// LeftWing.rotateAngleZ = 2F + (((EntityPixelmon)entity).animationCounter2
	// + 90) * 0.034906585F;
	// }
	//
	// else if (((EntityPixelmon)entity).animationCounter2 * 3 >= 0) {
	// LeftWing.rotateAngleZ = 0F +
	// -((((EntityPixelmon)entity).animationCounter2 - 90) * 0.034906585F);
	// }
	//
	//
	// if (((EntityPixelmon)entity).animationCounter2 * 3 - 180 < 0) {
	// RightWing.rotateAngleZ = -2F +
	// -(((EntityPixelmon)entity).animationCounter2 + 90) * 0.034906585F;
	// }
	//
	// else if (((EntityPixelmon)entity).animationCounter2 * 3 >= 0) {
	// RightWing.rotateAngleZ = 0F +
	// ((((EntityPixelmon)entity).animationCounter2 - 90) * 0.034906585F);
	// }
	//
	// if (((EntityPixelmon)entity).animationCounter2 * 3 -180 < 0) {
	// Body.rotationPointY = 20 -(((EntityPixelmon)entity).animationCounter2 +
	// 180) * 0.174532925F;
	// }
	//
	// else if (((EntityPixelmon)entity).animationCounter2 * 3 >= 0) {
	// Body.rotationPointY = 0 + (((EntityPixelmon)entity).animationCounter2 -
	// 180) * 0.174532925F;
	// }
	//
	//
	// if (((EntityPixelmon)entity).animationCounter2 >= 120){
	// ((EntityPixelmon)entity).animationCounter2 = 0;}
	//
}
