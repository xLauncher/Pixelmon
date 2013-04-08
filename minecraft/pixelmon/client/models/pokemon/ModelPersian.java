// Date: 2/6/2013 3:13:08 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.Quadruped.SkeletonQuadruped;

public class ModelPersian extends PixelmonModelBase {
	// fields

	PixelmonModelRenderer Body;

	public ModelPersian() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 12, -4);
		PixelmonModelRenderer body_1 = new PixelmonModelRenderer(this, 0, 53);
		body_1.addBox(-3F, 0F, 0F, 6, 6, 5);
		body_1.setTextureSize(128, 64);
		body_1.mirror = true;
		setRotation(body_1, 0F, 0F, 0F);
		Body.addChild(body_1);
		PixelmonModelRenderer body_2 = new PixelmonModelRenderer(this, 0, 40);
		body_2.addBox(-2.5F, 0F, 4F, 5, 5, 7);
		body_2.setTextureSize(128, 64);
		body_2.mirror = true;
		setRotation(body_2, -0.0349066F, 0F, 0F);
		Body.addChild(body_2);
		PixelmonModelRenderer tail_base = new PixelmonModelRenderer(this, 0, 33);
		tail_base.addBox(-1.5F, -0.6666667F, 10F, 3, 4, 2);
		tail_base.setTextureSize(128, 64);
		tail_base.mirror = true;
		setRotation(tail_base, -0.122173F, 0F, 0F);
		Body.addChild(tail_base);
		PixelmonModelRenderer neck_base = new PixelmonModelRenderer(this, 116,
				46);
		neck_base.addBox(-2F, 0.2F, 0.9333333F, 4, 5, 2);
		neck_base.setTextureSize(128, 64);
		neck_base.mirror = true;
		setRotation(neck_base, -0.5061455F, 0F, 0F);
		Body.addChild(neck_base);
		PixelmonModelRenderer neck_ = new PixelmonModelRenderer(this, 110, 54);
		neck_.addBox(-1.5F, 1.998401E-15F, -2.8F, 3, 4, 6);
		neck_.setTextureSize(128, 64);
		neck_.mirror = true;
		setRotation(neck_, -0.6283185F, 0F, 0F);
		Body.addChild(neck_);

		PixelmonModelRenderer BLLeg = new PixelmonModelRenderer(this, "BLLeg");
		BLLeg.setRotationPoint(2, 4, 8);
		PixelmonModelRenderer L1_leg_1 = new PixelmonModelRenderer(this, 48, 0);
		L1_leg_1.addBox(-0.3333333F, -1.533333F, 0F, 2, 4, 3);
		L1_leg_1.setTextureSize(128, 64);
		L1_leg_1.mirror = true;
		setRotation(L1_leg_1, -0.1047198F, 0F, 0F);
		BLLeg.addChild(L1_leg_1);
		PixelmonModelRenderer L1_leg_2 = new PixelmonModelRenderer(this, 48, 8);
		L1_leg_2.addBox(0.06666667F, 0.4666667F, 1F, 1, 2, 4);
		L1_leg_2.setTextureSize(128, 64);
		L1_leg_2.mirror = true;
		setRotation(L1_leg_2, -0.418879F, 0F, 0F);
		BLLeg.addChild(L1_leg_2);
		PixelmonModelRenderer L1_leg_3 = new PixelmonModelRenderer(this, 48, 15);
		L1_leg_3.addBox(0.5333334F, -5F, 2F, 1, 2, 5);
		L1_leg_3.setTextureSize(128, 64);
		L1_leg_3.mirror = true;
		setRotation(L1_leg_3, -1.780236F, -0.1047198F, 0F);
		BLLeg.addChild(L1_leg_3);
		PixelmonModelRenderer L1_paw_2 = new PixelmonModelRenderer(this, 22, 0);
		L1_paw_2.addBox(0.1333333F, 7F, 1F, 2, 1, 2);
		L1_paw_2.setTextureSize(128, 64);
		L1_paw_2.mirror = true;
		setRotation(L1_paw_2, 0F, -0.1047198F, 0F);
		BLLeg.addChild(L1_paw_2);
		Body.addChild(BLLeg);

		PixelmonModelRenderer BRLeg = new PixelmonModelRenderer(this, "BRLeg");
		BRLeg.setRotationPoint(-2, 4, 8);
		PixelmonModelRenderer R_1_leg_1 = new PixelmonModelRenderer(this, 48, 0);
		R_1_leg_1.addBox(-1.333333F, -1.533333F, 0F, 2, 4, 3);
		R_1_leg_1.setTextureSize(128, 64);
		R_1_leg_1.mirror = true;
		setRotation(R_1_leg_1, -0.1047198F, 0F, 0F);
		BRLeg.addChild(R_1_leg_1);
		PixelmonModelRenderer R1_leg_2 = new PixelmonModelRenderer(this, 48, 8);
		R1_leg_2.addBox(-0.9333333F, 0.4666667F, 1F, 1, 2, 4);
		R1_leg_2.setTextureSize(128, 64);
		R1_leg_2.mirror = true;
		setRotation(R1_leg_2, -0.418879F, 0F, 0F);
		BRLeg.addChild(R1_leg_2);
		PixelmonModelRenderer R1_leg_3 = new PixelmonModelRenderer(this, 48, 15);
		R1_leg_3.addBox(-1.466667F, -5F, 2F, 1, 2, 5);
		R1_leg_3.setTextureSize(128, 64);
		R1_leg_3.mirror = true;
		setRotation(R1_leg_3, -1.780236F, 0.1047198F, 0F);
		BRLeg.addChild(R1_leg_3);
		PixelmonModelRenderer R_paw_2 = new PixelmonModelRenderer(this, 22, 0);
		R_paw_2.addBox(-1.866667F, 7F, 1F, 2, 1, 2);
		R_paw_2.setTextureSize(128, 64);
		R_paw_2.mirror = true;
		setRotation(R_paw_2, 0F, 0.1047198F, 0F);
		BRLeg.addChild(R_paw_2);
		Body.addChild(BRLeg);

		PixelmonModelRenderer FLLeg = new PixelmonModelRenderer(this, "FLLeg");
		FLLeg.setRotationPoint(3, 4, 1);
		PixelmonModelRenderer L2_leg_1 = new PixelmonModelRenderer(this, 31, 0);
		L2_leg_1.addBox(-1F, -1.533333F, 0F, 2, 5, 3);
		L2_leg_1.setTextureSize(128, 64);
		L2_leg_1.mirror = true;
		setRotation(L2_leg_1, 0.122173F, 0F, 0F);
		FLLeg.addChild(L2_leg_1);
		PixelmonModelRenderer L2_leg_2 = new PixelmonModelRenderer(this, 31, 9);
		L2_leg_2.addBox(-0.2666667F, 2.533333F, 1.466667F, 1, 5, 2);
		L2_leg_2.setTextureSize(128, 64);
		L2_leg_2.mirror = true;
		setRotation(L2_leg_2, -0.1745329F, -0.1745329F, 0F);
		FLLeg.addChild(L2_leg_2);
		PixelmonModelRenderer L2_paw_1 = new PixelmonModelRenderer(this, 22, 0);
		L2_paw_1.addBox(-0.6666667F, 7F, -0.5333334F, 2, 1, 2);
		L2_paw_1.setTextureSize(128, 64);
		L2_paw_1.mirror = true;
		setRotation(L2_paw_1, 0F, -0.1745329F, 0F);
		FLLeg.addChild(L2_paw_1);
		Body.addChild(FLLeg);

		PixelmonModelRenderer FRLeg = new PixelmonModelRenderer(this, "FRLeg");
		FRLeg.setRotationPoint(-3, 4, 1);
		PixelmonModelRenderer R2_leg_1 = new PixelmonModelRenderer(this, 31, 0);
		R2_leg_1.addBox(-1F, -1.533333F, 0F, 2, 5, 3);
		R2_leg_1.setTextureSize(128, 64);
		R2_leg_1.mirror = true;
		setRotation(R2_leg_1, 0.122173F, 0F, 0F);
		FRLeg.addChild(R2_leg_1);
		PixelmonModelRenderer R2_leg_2 = new PixelmonModelRenderer(this, 31, 9);
		R2_leg_2.addBox(-0.7333333F, 2.533333F, 1.466667F, 1, 5, 2);
		R2_leg_2.setTextureSize(128, 64);
		R2_leg_2.mirror = true;
		setRotation(R2_leg_2, -0.1745329F, 0.1745329F, 0F);
		FRLeg.addChild(R2_leg_2);
		PixelmonModelRenderer R2_paw_1 = new PixelmonModelRenderer(this, 22, 0);
		R2_paw_1.addBox(-1.066667F, 7F, -0.5333334F, 2, 1, 2);
		R2_paw_1.setTextureSize(128, 64);
		R2_paw_1.mirror = true;
		setRotation(R2_paw_1, 0F, 0.1745329F, 0F);
		FRLeg.addChild(R2_paw_1);
		Body.addChild(FRLeg);

		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 2, 11);
		PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 0, 28);
		tail_1.addBox(-0.9F, -1F, 0.1333333F, 2, 2, 2);
		tail_1.setTextureSize(128, 64);
		tail_1.mirror = true;
		setRotation(tail_1, -0.3141593F, 0F, 0F);
		Tail.addChild(tail_1);
		PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 0, 0);
		tail_2.addBox(-0.5F, -0.6666667F, 1.6F, 1, 1, 2);
		tail_2.setTextureSize(128, 64);
		tail_2.mirror = true;
		setRotation(tail_2, -0.2792527F, 0F, 0F);
		Tail.addChild(tail_2);
		PixelmonModelRenderer tail_3 = new PixelmonModelRenderer(this, 0, 0);
		tail_3.addBox(-0.5F, -0.2666667F, 3.6F, 1, 1, 2);
		tail_3.setTextureSize(128, 64);
		tail_3.mirror = true;
		setRotation(tail_3, -0.1745329F, 0F, 0F);
		Tail.addChild(tail_3);
		PixelmonModelRenderer tail_4 = new PixelmonModelRenderer(this, 0, 0);
		tail_4.addBox(-0.5F, 0.4F, 5.5F, 1, 1, 2);
		tail_4.setTextureSize(128, 64);
		tail_4.mirror = true;
		setRotation(tail_4, -0.0523599F, 0F, 0F);
		Tail.addChild(tail_4);
		PixelmonModelRenderer tail_5 = new PixelmonModelRenderer(this, 0, 0);
		tail_5.addBox(-0.5F, 1.5F, 7.166667F, 1, 1, 2);
		tail_5.setTextureSize(128, 64);
		tail_5.mirror = true;
		setRotation(tail_5, 0.1047198F, 0F, 0F);
		Tail.addChild(tail_5);
		PixelmonModelRenderer tail_6 = new PixelmonModelRenderer(this, 0, 11);
		tail_6.addBox(-0.5F, 2.9F, 9.766666F, 1, 3, 3);
		tail_6.setTextureSize(128, 64);
		tail_6.mirror = true;
		setRotation(tail_6, 0.4363323F, 0F, 0F);
		Tail.addChild(tail_6);
		PixelmonModelRenderer tail_7 = new PixelmonModelRenderer(this, 0, 0);
		tail_7.addBox(-0.5F, 2.1F, 8.9F, 1, 1, 2);
		tail_7.setTextureSize(128, 64);
		tail_7.mirror = true;
		setRotation(tail_7, 0.1745329F, 0F, 0F);
		Tail.addChild(tail_7);
		Body.addChild(Tail);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -1, -3);
		PixelmonModelRenderer head = new PixelmonModelRenderer(this, 35, 56);
		head.addBox(-2.5F, -1.266667F, -3F, 5, 4, 4);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, -0.0349066F, 0F, 0F);
		Head.addChild(head);
		PixelmonModelRenderer snout_1 = new PixelmonModelRenderer(this, 54, 59);
		snout_1.addBox(-1.5F, 1.2F, -4.333333F, 3, 2, 3);
		snout_1.setTextureSize(128, 64);
		snout_1.mirror = true;
		setRotation(snout_1, 0.1919862F, 0F, 0F);
		Head.addChild(snout_1);
		PixelmonModelRenderer snout_2 = new PixelmonModelRenderer(this, 7, 55);
		snout_2.addBox(-1F, -1.066667F, -4.333333F, 2, 1, 3);
		snout_2.setTextureSize(128, 64);
		snout_2.mirror = true;
		setRotation(snout_2, 0.6981317F, 0F, 0F);
		Head.addChild(snout_2);
		PixelmonModelRenderer L_ear = new PixelmonModelRenderer(this, 72, 54);
		L_ear.addBox(1.333333F, -2.333333F, 1.066667F, 0, 5, 5);
		L_ear.setTextureSize(128, 64);
		L_ear.mirror = true;
		setRotation(L_ear, 0.5585054F, 1.012291F, 0F);
		Head.addChild(L_ear);
		PixelmonModelRenderer R_ear = new PixelmonModelRenderer(this, 72, 54);
		R_ear.addBox(-1.266667F, -2.333333F, 1.066667F, 0, 5, 5);
		R_ear.setTextureSize(128, 64);
		R_ear.mirror = true;
		setRotation(R_ear, 0.5585054F, -1.012291F, 0F);
		Head.addChild(R_ear);
		PixelmonModelRenderer gem = new PixelmonModelRenderer(this, 31, 53);
		gem.addBox(-0.5F, -0.2666667F, -3.333333F, 1, 1, 1);
		gem.setTextureSize(128, 64);
		gem.mirror = true;
		setRotation(gem, -0.2617994F, 0F, 0F);
		Head.addChild(gem);
		PixelmonModelRenderer head_2 = new PixelmonModelRenderer(this, 36, 49);
		head_2.addBox(-3.033333F, 0.4666667F, -3.066667F, 1, 2, 4);
		head_2.setTextureSize(128, 64);
		head_2.mirror = true;
		setRotation(head_2, 0.3839724F, -0.2094395F, -0.1047198F);
		Head.addChild(head_2);
		PixelmonModelRenderer head_3 = new PixelmonModelRenderer(this, 36, 49);
		head_3.addBox(1.966667F, 0.4666667F, -3.066667F, 1, 2, 4);
		head_3.setTextureSize(128, 64);
		head_3.mirror = true;
		setRotation(head_3, 0.3839724F, 0.2094395F, 0.1047198F);
		Head.addChild(head_3);
		PixelmonModelRenderer L_whiskers = new PixelmonModelRenderer(this, 30,
				40);
		L_whiskers.addBox(0.9666666F, -0.6F, -3.733333F, 5, 4, 0);
		L_whiskers.setTextureSize(128, 64);
		L_whiskers.mirror = true;
		setRotation(L_whiskers, 0.3490659F, 0F, 0.0872665F);
		Head.addChild(L_whiskers);
		PixelmonModelRenderer R_whiskers = new PixelmonModelRenderer(this, 35,
				40);
		R_whiskers.addBox(-6.033333F, -0.6F, -3.733333F, 5, 4, 0);
		R_whiskers.setTextureSize(128, 64);
		R_whiskers.mirror = true;
		setRotation(R_whiskers, 0.3490659F, 0F, -0.0872665F);
		Head.addChild(R_whiskers);
		Body.addChild(Head);

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

		Body.render(f5);

	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
