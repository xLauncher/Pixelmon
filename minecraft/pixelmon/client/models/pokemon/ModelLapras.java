package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLapras extends ModelBase {
	// fields
	ModelRenderer backfinL1;
	ModelRenderer backfinL2;
	ModelRenderer backfinL3;
	ModelRenderer backfinL4;
	ModelRenderer backfinL5;
	ModelRenderer backfinL6;
	ModelRenderer backfinL7;
	ModelRenderer backfinL9;
	ModelRenderer neck2;
	ModelRenderer neck3;
	ModelRenderer neck4;
	ModelRenderer chest1;
	ModelRenderer chest2;
	ModelRenderer chin3;
	ModelRenderer head7;
	ModelRenderer head9;
	ModelRenderer chin2;
	ModelRenderer horn;
	ModelRenderer body2;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer shell1;
	ModelRenderer shell3;
	ModelRenderer shell5;
	ModelRenderer shell6;
	ModelRenderer shell7;
	ModelRenderer shell8;
	ModelRenderer shell9;
	ModelRenderer shell11;
	ModelRenderer shell13;
	ModelRenderer shell14;
	ModelRenderer shell15;
	ModelRenderer shell16;
	ModelRenderer shell17;
	ModelRenderer shell18;
	ModelRenderer shell19;
	ModelRenderer shell20;
	ModelRenderer shell23;
	ModelRenderer shell24;
	ModelRenderer spike2;
	ModelRenderer spike3;
	ModelRenderer spike4;
	ModelRenderer spike5;
	ModelRenderer spike6;
	ModelRenderer spike7;
	ModelRenderer backfinR1;
	ModelRenderer backfinR2;
	ModelRenderer backfinR3;
	ModelRenderer backfinR4;
	ModelRenderer backfinR5;
	ModelRenderer backfinR6;
	ModelRenderer backfinR7;
	ModelRenderer backfinR9;
	ModelRenderer finR2;
	ModelRenderer finR3;
	ModelRenderer finR4;
	ModelRenderer finR5;
	ModelRenderer finR8;
	ModelRenderer finL2;
	ModelRenderer finL4;
	ModelRenderer finL5;
	ModelRenderer finL7;
	ModelRenderer finL8;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer tail3;
	ModelRenderer tail4;
	ModelRenderer tail;
	ModelRenderer backfinR;
	ModelRenderer backfinL;
	ModelRenderer finR;
	ModelRenderer finL;
	ModelRenderer body;
	ModelRenderer neck;
	ModelRenderer backfinR8;
	ModelRenderer backfinL8;
	ModelRenderer finR1;
	ModelRenderer finR6;
	ModelRenderer finR7;
	ModelRenderer finR9;
	ModelRenderer finR10;
	ModelRenderer finR11;
	ModelRenderer finL1;
	ModelRenderer finL3;
	ModelRenderer finL6;
	ModelRenderer finL9;
	ModelRenderer finL10;
	ModelRenderer finL11;
	ModelRenderer body1;
	ModelRenderer body3;
	ModelRenderer shell2;
	ModelRenderer shell4;
	ModelRenderer shell10;
	ModelRenderer shell12;
	ModelRenderer shell21;
	ModelRenderer shell22;
	ModelRenderer spike1;
	ModelRenderer head1;
	ModelRenderer head2;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head8;
	ModelRenderer head10;
	ModelRenderer chin1;
	ModelRenderer earL;
	ModelRenderer earR;
	ModelRenderer eyes;
	ModelRenderer neck1;
	ModelRenderer chest3;
	ModelRenderer head;

	public ModelLapras() {
		textureWidth = 128;
		textureHeight = 64;
		setTextureOffset("tail.map_tail", 0, 0);
		setTextureOffset("backfinR.mapbackfinR", 0, 0);
		setTextureOffset("backfinL.mapbackfinL", 0, 0);
		setTextureOffset("finR.mapfinR", 0, 0);
		setTextureOffset("finL.mapfinR", 0, 0);
		setTextureOffset("body.mapbody", 0, 0);
		setTextureOffset("neck.mapneck", 0, 0);
		setTextureOffset("head.maphead", 0, 0);

		backfinL1 = new ModelRenderer(this, 108, 59);
		backfinL1.addBox(-0.5F, -2F, -1.5F, 8, 3, 2);
		backfinL1.setRotationPoint(0F, 0F, 0F);
		backfinL1.setTextureSize(128, 64);
		backfinL1.mirror = true;
		setRotation(backfinL1, 0F, -0.1745329F, 0F);
		backfinL2 = new ModelRenderer(this, 112, 57);
		backfinL2.addBox(3F, -2F, -2.1F, 4, 3, 4);
		backfinL2.setRotationPoint(0F, 0F, 0F);
		backfinL2.setTextureSize(128, 64);
		backfinL2.mirror = true;
		setRotation(backfinL2, 0F, -0.1745329F, 0F);
		backfinL3 = new ModelRenderer(this, 118, 59);
		backfinL3.addBox(4.2F, -2F, -6.3F, 3, 3, 2);
		backfinL3.setRotationPoint(0F, 0F, 0F);
		backfinL3.setTextureSize(128, 64);
		backfinL3.mirror = true;
		setRotation(backfinL3, 0F, -0.8726646F, 0F);
		backfinL4 = new ModelRenderer(this, 122, 60);
		backfinL4.addBox(1.5F, -2F, -0.3F, 2, 3, 1);
		backfinL4.setRotationPoint(0F, 0F, 0F);
		backfinL4.setTextureSize(128, 64);
		backfinL4.mirror = true;
		setRotation(backfinL4, 0F, 0.3490659F, 0F);
		backfinL5 = new ModelRenderer(this, 122, 60);
		backfinL5.addBox(1.5F, -2F, -1F, 2, 3, 1);
		backfinL5.setRotationPoint(0F, 0F, 0F);
		backfinL5.setTextureSize(128, 64);
		backfinL5.mirror = true;
		setRotation(backfinL5, 0F, -0.6981317F, 0F);
		backfinL6 = new ModelRenderer(this, 120, 59);
		backfinL6.addBox(7F, -2F, -2F, 2, 3, 2);
		backfinL6.setRotationPoint(0F, 0F, 0F);
		backfinL6.setTextureSize(128, 64);
		backfinL6.mirror = true;
		setRotation(backfinL6, 0F, -0.4363323F, 0F);
		backfinL7 = new ModelRenderer(this, 122, 59);
		backfinL7.addBox(8.5F, -2F, 0.5F, 1, 3, 2);
		backfinL7.setRotationPoint(0F, 0F, 0F);
		backfinL7.setTextureSize(128, 64);
		backfinL7.mirror = true;
		setRotation(backfinL7, 0F, -0.0872665F, 0F);
		backfinL9 = new ModelRenderer(this, 116, 61);
		backfinL9.addBox(3.5F, -2.5F, -1F, 4, 1, 2);
		backfinL9.setRotationPoint(0F, 0F, 0F);
		backfinL9.setTextureSize(128, 64);
		backfinL9.mirror = true;
		setRotation(backfinL9, 0F, -0.1745329F, 0F);
		neck2 = new ModelRenderer(this, 38, 49);
		neck2.addBox(-2.5F, -15F, -2.6F, 4, 11, 4);
		neck2.setRotationPoint(0F, 0F, 0F);
		neck2.setTextureSize(128, 64);
		neck2.mirror = true;
		setRotation(neck2, -0.3490659F, 0F, 0F);
		neck3 = new ModelRenderer(this, 24, 32);
		neck3.addBox(-3F, -5F, -3.4F, 5, 8, 4);
		neck3.setRotationPoint(0F, 0F, 0F);
		neck3.setTextureSize(128, 64);
		neck3.mirror = true;
		setRotation(neck3, -0.5235988F, 0F, 0F);
		neck4 = new ModelRenderer(this, 116, 58);
		neck4.addBox(-2.5F, -13.8F, 12.7F, 4, 4, 2);
		neck4.setRotationPoint(0F, 0F, 0F);
		neck4.setTextureSize(128, 64);
		neck4.mirror = true;
		setRotation(neck4, 0.6108652F, 0F, 0F);
		chest1 = new ModelRenderer(this, 76, 53);
		chest1.addBox(-2F, 1F, -4.5F, 5, 8, 3);
		chest1.setRotationPoint(0F, 0F, 0F);
		chest1.setTextureSize(128, 64);
		chest1.mirror = true;
		setRotation(chest1, 0F, -0.8726646F, 0F);
		chest2 = new ModelRenderer(this, 76, 53);
		chest2.addBox(-4F, 1F, -5.5F, 5, 8, 3);
		chest2.setRotationPoint(0F, 0F, 0F);
		chest2.setTextureSize(128, 64);
		chest2.mirror = true;
		setRotation(chest2, 0F, 0.8726646F, 0F);
		chin3 = new ModelRenderer(this, 112, 28);
		chin3.addBox(-4F, -3.8F, -8.5F, 2, 1, 6);
		chin3.setRotationPoint(0F, 0F, 0F);
		chin3.setTextureSize(128, 64);
		chin3.mirror = true;
		setRotation(chin3, 0F, -0.1745329F, 0F);
		head7 = new ModelRenderer(this, 116, 58);
		head7.addBox(-3F, -6F, -10.3F, 4, 4, 2);
		head7.setRotationPoint(0F, 0F, 0F);
		head7.setTextureSize(128, 64);
		head7.mirror = true;
		setRotation(head7, -0.1745329F, 0F, 0F);
		head9 = new ModelRenderer(this, 110, 57);
		head9.addBox(-3.5F, -11.7F, -2F, 5, 3, 4);
		head9.setRotationPoint(0F, 0F, 0F);
		head9.setTextureSize(128, 64);
		head9.mirror = true;
		setRotation(head9, 0.6981317F, 0F, 0F);
		chin2 = new ModelRenderer(this, 112, 28);
		chin2.addBox(0F, -3.8F, -8.7F, 2, 1, 6);
		chin2.setRotationPoint(0F, 0F, 0F);
		chin2.setTextureSize(128, 64);
		chin2.mirror = true;
		setRotation(chin2, 0F, 0.1745329F, 0F);
		horn = new ModelRenderer(this, 124, 60);
		horn.addBox(-3F, -14F, 0.7F, 1, 3, 1);
		horn.setRotationPoint(0F, 0F, 0F);
		horn.setTextureSize(128, 64);
		horn.mirror = true;
		setRotation(horn, 0.5235988F, 0.7853982F, 0.5235988F);
		body2 = new ModelRenderer(this, 82, 50);
		body2.addBox(-7F, -6.9F, -8F, 14, 5, 9);
		body2.setRotationPoint(0F, 0F, 0F);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, -0.122173F, 0F, 0F);
		body4 = new ModelRenderer(this, 0, 44);
		body4.addBox(0F, -5F, -0.5F, 8, 9, 11);
		body4.setRotationPoint(0F, 0F, 0F);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 0F, -0.1745329F, 0F);
		body5 = new ModelRenderer(this, 0, 44);
		body5.addBox(-8F, -5F, -0.5F, 8, 9, 11);
		body5.setRotationPoint(0F, 0F, 0F);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 0F, 0.1745329F, 0F);
		shell1 = new ModelRenderer(this, 90, 0);
		shell1.addBox(-8.5F, -8.4F, -6.4F, 17, 4, 2);
		shell1.setRotationPoint(0F, 0F, 0F);
		shell1.setTextureSize(128, 64);
		shell1.mirror = true;
		setRotation(shell1, -0.122173F, 0F, 0F);
		shell3 = new ModelRenderer(this, 120, 0);
		shell3.addBox(7F, -6.4F, -1.6F, 2, 4, 2);
		shell3.setRotationPoint(0F, 0F, 0F);
		shell3.setTextureSize(128, 64);
		shell3.mirror = true;
		setRotation(shell3, 0.9599311F, 0F, 0F);
		shell5 = new ModelRenderer(this, 116, 0);
		shell5.addBox(7F, -2.6F, -0.8F, 2, 2, 4);
		shell5.setRotationPoint(0F, 0F, 0F);
		shell5.setTextureSize(128, 64);
		shell5.mirror = true;
		setRotation(shell5, 0.5235988F, 0F, 0F);
		shell6 = new ModelRenderer(this, 120, 0);
		shell6.addBox(7.3F, -3.9F, -0.1F, 2, 2, 2);
		shell6.setRotationPoint(0F, 0F, 0F);
		shell6.setTextureSize(128, 64);
		shell6.mirror = true;
		setRotation(shell6, 0F, -0.1745329F, 0F);
		shell7 = new ModelRenderer(this, 116, 0);
		shell7.addBox(7.1F, -4F, 1.5F, 2, 2, 4);
		shell7.setRotationPoint(0F, 0F, 0F);
		shell7.setTextureSize(128, 64);
		shell7.mirror = true;
		setRotation(shell7, -0.0872665F, -0.1745329F, 0F);
		shell8 = new ModelRenderer(this, 116, 0);
		shell8.addBox(7.1F, -3.5F, 5.7F, 2, 2, 4);
		shell8.setRotationPoint(0F, 0F, 0F);
		shell8.setTextureSize(128, 64);
		shell8.mirror = true;
		setRotation(shell8, 0F, -0.1745329F, 0F);
		shell9 = new ModelRenderer(this, 118, 0);
		shell9.addBox(6.1F, -3.5F, 9.4F, 3, 2, 2);
		shell9.setRotationPoint(0F, 0F, 0F);
		shell9.setTextureSize(128, 64);
		shell9.mirror = true;
		setRotation(shell9, 0F, -0.1745329F, 0F);
		shell11 = new ModelRenderer(this, 120, 0);
		shell11.addBox(-9F, -6.5F, -1.5F, 2, 4, 2);
		shell11.setRotationPoint(0F, 0F, 0F);
		shell11.setTextureSize(128, 64);
		shell11.mirror = true;
		setRotation(shell11, 0.9599311F, 0F, 0F);
		shell13 = new ModelRenderer(this, 116, 0);
		shell13.addBox(-9F, -2.5F, -0.7F, 2, 2, 4);
		shell13.setRotationPoint(0F, 0F, 0F);
		shell13.setTextureSize(128, 64);
		shell13.mirror = true;
		setRotation(shell13, 0.5235988F, 0F, 0F);
		shell14 = new ModelRenderer(this, 120, 0);
		shell14.addBox(-9.3F, -3.9F, 0F, 2, 2, 2);
		shell14.setRotationPoint(0F, 0F, 0F);
		shell14.setTextureSize(128, 64);
		shell14.mirror = true;
		setRotation(shell14, 0F, 0.1745329F, 0F);
		shell15 = new ModelRenderer(this, 116, 0);
		shell15.addBox(-9.3F, -4F, 1.8F, 2, 2, 4);
		shell15.setRotationPoint(0F, 0F, 0F);
		shell15.setTextureSize(128, 64);
		shell15.mirror = true;
		setRotation(shell15, -0.0872665F, 0.1745329F, 0F);
		shell16 = new ModelRenderer(this, 116, 0);
		shell16.addBox(-9.3F, -3.5F, 6F, 2, 2, 4);
		shell16.setRotationPoint(0F, 0F, 0F);
		shell16.setTextureSize(128, 64);
		shell16.mirror = true;
		setRotation(shell16, 0F, 0.1745329F, 0F);
		shell17 = new ModelRenderer(this, 116, 0);
		shell17.addBox(-9.3F, -3.6F, 9.4F, 4, 2, 2);
		shell17.setRotationPoint(0F, 0F, 0F);
		shell17.setTextureSize(128, 64);
		shell17.mirror = true;
		setRotation(shell17, 0F, 0.1745329F, 0F);
		shell18 = new ModelRenderer(this, 116, 0);
		shell18.addBox(2.6F, -2.4F, 9.4F, 4, 2, 2);
		shell18.setRotationPoint(0F, 0F, 0F);
		shell18.setTextureSize(128, 64);
		shell18.mirror = true;
		setRotation(shell18, 0F, -0.1745329F, -0.1745329F);
		shell19 = new ModelRenderer(this, 116, 0);
		shell19.addBox(-5.8F, -2.6F, 9.4F, 4, 2, 2);
		shell19.setRotationPoint(0F, 0F, 0F);
		shell19.setTextureSize(128, 64);
		shell19.mirror = true;
		setRotation(shell19, 0F, 0.1745329F, 0.1745329F);
		shell20 = new ModelRenderer(this, 86, 0);
		shell20.addBox(-8F, -8F, -4.1F, 16, 3, 5);
		shell20.setRotationPoint(0F, 0F, 0F);
		shell20.setTextureSize(128, 64);
		shell20.mirror = true;
		setRotation(shell20, 0.122173F, 0F, 0F);
		shell23 = new ModelRenderer(this, 90, 0);
		shell23.addBox(-0.5F, -7.5F, -3.1F, 8, 3, 11);
		shell23.setRotationPoint(0F, 0F, 0F);
		shell23.setTextureSize(128, 64);
		shell23.mirror = true;
		setRotation(shell23, -0.2617994F, -0.1745329F, 0.0523599F);
		shell24 = new ModelRenderer(this, 90, 0);
		shell24.addBox(-7.2F, -7.5F, -3.3F, 8, 3, 11);
		shell24.setRotationPoint(0F, 0F, 0F);
		shell24.setTextureSize(128, 64);
		shell24.mirror = true;
		setRotation(shell24, -0.2617994F, 0.1745329F, -0.0872665F);
		spike2 = new ModelRenderer(this, 120, 0);
		spike2.addBox(2F, -12F, -2.5F, 2, 3, 2);
		spike2.setRotationPoint(0F, 0F, 0F);
		spike2.setTextureSize(128, 64);
		spike2.mirror = true;
		setRotation(spike2, 0F, 0F, 0.3490659F);
		spike3 = new ModelRenderer(this, 120, 0);
		spike3.addBox(-4F, -12F, -2.5F, 2, 3, 2);
		spike3.setRotationPoint(0F, 0F, 0F);
		spike3.setTextureSize(128, 64);
		spike3.mirror = true;
		setRotation(spike3, 0F, 0F, -0.3490659F);
		spike4 = new ModelRenderer(this, 120, 0);
		spike4.addBox(-1F, -10F, 0.3F, 2, 3, 2);
		spike4.setRotationPoint(0F, 0F, 0F);
		spike4.setTextureSize(128, 64);
		spike4.mirror = true;
		setRotation(spike4, -0.2617994F, 0F, 0F);
		spike5 = new ModelRenderer(this, 120, 0);
		spike5.addBox(2F, -11F, 0.3F, 2, 3, 2);
		spike5.setRotationPoint(0F, 0F, 0F);
		spike5.setTextureSize(128, 64);
		spike5.mirror = true;
		setRotation(spike5, -0.2617994F, 0F, 0.3490659F);
		spike6 = new ModelRenderer(this, 120, 0);
		spike6.addBox(-4F, -11F, 0.3F, 2, 3, 2);
		spike6.setRotationPoint(0F, 0F, 0F);
		spike6.setTextureSize(128, 64);
		spike6.mirror = true;
		setRotation(spike6, -0.2617994F, 0F, -0.3490659F);
		spike7 = new ModelRenderer(this, 120, 0);
		spike7.addBox(-1F, -10.5F, 3F, 2, 3, 2);
		spike7.setRotationPoint(0F, 0F, 0F);
		spike7.setTextureSize(128, 64);
		spike7.mirror = true;
		setRotation(spike7, -0.5235988F, 0F, 0F);
		backfinR1 = new ModelRenderer(this, 108, 59);
		backfinR1.addBox(-8F, -2F, -1.3F, 8, 3, 2);
		backfinR1.setRotationPoint(0F, 0F, 0F);
		backfinR1.setTextureSize(128, 64);
		backfinR1.mirror = true;
		setRotation(backfinR1, 0F, 0.1745329F, 0F);
		backfinR2 = new ModelRenderer(this, 112, 57);
		backfinR2.addBox(-7F, -2F, -2.2F, 4, 3, 4);
		backfinR2.setRotationPoint(0F, 0F, 0F);
		backfinR2.setTextureSize(128, 64);
		backfinR2.mirror = true;
		setRotation(backfinR2, 0F, 0.1745329F, 0F);
		backfinR3 = new ModelRenderer(this, 118, 59);
		backfinR3.addBox(-7.1F, -2F, -6.2F, 3, 3, 2);
		backfinR3.setRotationPoint(0F, 0F, 0F);
		backfinR3.setTextureSize(128, 64);
		backfinR3.mirror = true;
		setRotation(backfinR3, 0F, 0.8726646F, 0F);
		backfinR4 = new ModelRenderer(this, 122, 59);
		backfinR4.addBox(-9.5F, -2F, 0.6F, 1, 3, 2);
		backfinR4.setRotationPoint(0F, 0F, 0F);
		backfinR4.setTextureSize(128, 64);
		backfinR4.mirror = true;
		setRotation(backfinR4, 0F, 0.0872665F, 0F);
		backfinR5 = new ModelRenderer(this, 122, 60);
		backfinR5.addBox(-3.7F, -2F, -0.4F, 2, 3, 1);
		backfinR5.setRotationPoint(0F, 0F, 0F);
		backfinR5.setTextureSize(128, 64);
		backfinR5.mirror = true;
		setRotation(backfinR5, 0F, -0.3490659F, 0F);
		backfinR6 = new ModelRenderer(this, 122, 60);
		backfinR6.addBox(-3.4F, -2F, -1F, 2, 3, 1);
		backfinR6.setRotationPoint(0F, 0F, 0F);
		backfinR6.setTextureSize(128, 64);
		backfinR6.mirror = true;
		setRotation(backfinR6, 0F, 0.6981317F, 0F);
		backfinR7 = new ModelRenderer(this, 120, 59);
		backfinR7.addBox(-9F, -2F, -2.1F, 2, 3, 2);
		backfinR7.setRotationPoint(0F, 0F, 0F);
		backfinR7.setTextureSize(128, 64);
		backfinR7.mirror = true;
		setRotation(backfinR7, 0F, 0.4363323F, 0F);
		backfinR9 = new ModelRenderer(this, 116, 61);
		backfinR9.addBox(-7.5F, -2.5F, -1F, 4, 1, 2);
		backfinR9.setRotationPoint(0F, 0F, 0F);
		backfinR9.setTextureSize(128, 64);
		backfinR9.mirror = true;
		setRotation(backfinR9, 0F, 0.1745329F, 0F);
		finR2 = new ModelRenderer(this, 122, 59);
		finR2.addBox(-0.4F, -1F, -3.2F, 1, 3, 2);
		finR2.setRotationPoint(0F, 0F, 0F);
		finR2.setTextureSize(128, 64);
		finR2.mirror = true;
		setRotation(finR2, 0F, 1.22173F, 0F);
		finR3 = new ModelRenderer(this, 118, 58);
		finR3.addBox(-6.3F, -1F, 4.8F, 2, 3, 3);
		finR3.setRotationPoint(0F, 0F, 0F);
		finR3.setTextureSize(128, 64);
		finR3.mirror = true;
		setRotation(finR3, 0F, -0.8726646F, 0F);
		finR4 = new ModelRenderer(this, 120, 58);
		finR4.addBox(-9.3F, -1F, 3.5F, 1, 3, 3);
		finR4.setRotationPoint(0F, 0F, 0F);
		finR4.setTextureSize(128, 64);
		finR4.mirror = true;
		setRotation(finR4, 0F, -0.3490659F, 0F);
		finR5 = new ModelRenderer(this, 120, 58);
		finR5.addBox(0.2F, -1F, 1.7F, 1, 3, 3);
		finR5.setRotationPoint(0F, 0F, 0F);
		finR5.setTextureSize(128, 64);
		finR5.mirror = true;
		setRotation(finR5, 0F, -1.047198F, 0F);
		finR8 = new ModelRenderer(this, 120, 58);
		finR8.addBox(1.1F, -1F, 7.5F, 1, 3, 3);
		finR8.setRotationPoint(0F, 0F, 0F);
		finR8.setTextureSize(128, 64);
		finR8.mirror = true;
		setRotation(finR8, 0F, -1.396263F, 0F);
		finL2 = new ModelRenderer(this, 122, 59);
		finL2.addBox(-0.6F, -1F, -3.2F, 1, 3, 2);
		finL2.setRotationPoint(0F, 0F, 0F);
		finL2.setTextureSize(128, 64);
		finL2.mirror = true;
		setRotation(finL2, 0F, -1.22173F, 0F);
		finL4 = new ModelRenderer(this, 120, 58);
		finL4.addBox(-1.2F, -1F, 1.8F, 1, 3, 3);
		finL4.setRotationPoint(0F, 0F, 0F);
		finL4.setTextureSize(128, 64);
		finL4.mirror = true;
		setRotation(finL4, 0F, 1.047198F, 0F);
		finL5 = new ModelRenderer(this, 118, 58);
		finL5.addBox(4.3F, -1F, 5F, 2, 3, 3);
		finL5.setRotationPoint(0F, 0F, 0F);
		finL5.setTextureSize(128, 64);
		finL5.mirror = true;
		setRotation(finL5, 0F, 0.8726646F, 0F);
		finL7 = new ModelRenderer(this, 120, 58);
		finL7.addBox(8.4F, -1F, 3.8F, 1, 3, 3);
		finL7.setRotationPoint(0F, 0F, 0F);
		finL7.setTextureSize(128, 64);
		finL7.mirror = true;
		setRotation(finL7, 0F, 0.3490659F, 0F);
		finL8 = new ModelRenderer(this, 120, 58);
		finL8.addBox(-2F, -1F, 7.8F, 1, 3, 3);
		finL8.setRotationPoint(0F, 0F, 0F);
		finL8.setTextureSize(128, 64);
		finL8.mirror = true;
		setRotation(finL8, 0F, 1.396263F, 0F);
		tail1 = new ModelRenderer(this, 112, 57);
		tail1.addBox(-2.4F, -0.5F, 0.2F, 3, 2, 5);
		tail1.setRotationPoint(0F, 0F, 0F);
		tail1.setTextureSize(128, 64);
		tail1.mirror = true;
		setRotation(tail1, 0F, 0.1745329F, 0F);
		tail2 = new ModelRenderer(this, 112, 57);
		tail2.addBox(-0.6F, -0.5F, 0.3F, 3, 2, 5);
		tail2.setRotationPoint(0F, 0F, 0F);
		tail2.setTextureSize(128, 64);
		tail2.mirror = true;
		setRotation(tail2, 0F, -0.1745329F, 0F);
		tail3 = new ModelRenderer(this, 120, 60);
		tail3.addBox(-4.9F, -0.5F, 2.9F, 2, 2, 2);
		tail3.setRotationPoint(0F, 0F, 0F);
		tail3.setTextureSize(128, 64);
		tail3.mirror = true;
		setRotation(tail3, 0F, 0.7853982F, 0F);
		tail4 = new ModelRenderer(this, 114, 57);
		tail4.addBox(-1F, -2.5F, 0F, 2, 2, 5);
		tail4.setRotationPoint(0F, 0F, 0F);
		tail4.setTextureSize(128, 64);
		tail4.mirror = true;
		setRotation(tail4, -0.4363323F, 0F, 0F);
		tail = new ModelRenderer(this, "tail");
		tail.setRotationPoint(0F, 22.5F, 14F);
		setRotation(tail, 0F, 0F, 0F);
		tail.mirror = true;
		backfinR = new ModelRenderer(this, "backfinR");
		backfinR.setRotationPoint(-7F, 22.5F, 11F);
		setRotation(backfinR, 0F, 0F, 0F);
		backfinR.mirror = true;
		backfinR8 = new ModelRenderer(this, 124, 60);
		backfinR8.addBox(-9.2F, -2F, 2.7F, 1, 3, 1);
		backfinR8.setRotationPoint(0F, 0F, 0F);
		backfinR8.setTextureSize(128, 64);
		backfinR8.mirror = true;
		setRotation(backfinR8, 0F, 0F, 0F);
		backfinL = new ModelRenderer(this, "backfinL");
		backfinL.setRotationPoint(7F, 22.5F, 11F);
		setRotation(backfinL, 0F, 0F, 0F);
		backfinL.mirror = true;
		backfinL8 = new ModelRenderer(this, 124, 60);
		backfinL8.addBox(8.3F, -2F, 2.7F, 1, 3, 1);
		backfinL8.setRotationPoint(0F, 0F, 0F);
		backfinL8.setTextureSize(128, 64);
		backfinL8.mirror = true;
		setRotation(backfinL8, 0F, 0F, 0F);
		finR = new ModelRenderer(this, "finR");
		finR.setRotationPoint(-8F, 21.5F, -3F);
		setRotation(finR, 0F, 0F, 0F);
		finR.mirror = true;
		finR1 = new ModelRenderer(this, 106, 58);
		finR1.addBox(-8F, -1F, -1F, 8, 3, 3);
		finR1.setRotationPoint(0F, 0F, 0F);
		finR1.setTextureSize(128, 64);
		finR1.mirror = true;
		setRotation(finR1, 0F, 0F, 0F);
		finR6 = new ModelRenderer(this, 116, 60);
		finR6.addBox(-7.8F, -1F, -1.7F, 5, 3, 1);
		finR6.setRotationPoint(0F, 0F, 0F);
		finR6.setTextureSize(128, 64);
		finR6.mirror = true;
		setRotation(finR6, 0F, 0F, 0F);
		finR7 = new ModelRenderer(this, 118, 60);
		finR7.addBox(-7.5F, -1F, 2.5F, 4, 3, 1);
		finR7.setRotationPoint(0F, 0F, 0F);
		finR7.setTextureSize(128, 64);
		finR7.mirror = true;
		setRotation(finR7, 0F, 0F, 0F);
		finR9 = new ModelRenderer(this, 124, 60);
		finR9.addBox(-11F, -1F, 3F, 1, 3, 1);
		finR9.setRotationPoint(0F, 0F, 0F);
		finR9.setTextureSize(128, 64);
		finR9.mirror = true;
		setRotation(finR9, 0F, 0F, 0F);
		finR10 = new ModelRenderer(this, 110, 59);
		finR10.addBox(-10F, -1F, 1F, 7, 3, 2);
		finR10.setRotationPoint(0F, 0F, 0F);
		finR10.setTextureSize(128, 64);
		finR10.mirror = true;
		setRotation(finR10, 0F, 0F, 0F);
		finR11 = new ModelRenderer(this, 112, 60);
		finR11.addBox(-7.5F, -1.5F, -1F, 5, 1, 3);
		finR11.setRotationPoint(0F, 0F, 0F);
		finR11.setTextureSize(128, 64);
		finR11.mirror = true;
		setRotation(finR11, 0F, 0F, 0F);
		finL = new ModelRenderer(this, "finL");
		finL.setRotationPoint(8F, 21.5F, -3F);
		setRotation(finL, 0F, 0F, 0F);
		finL.mirror = true;
		finL1 = new ModelRenderer(this, 106, 58);
		finL1.addBox(0F, -1F, -1F, 8, 3, 3);
		finL1.setRotationPoint(0F, 0F, 0F);
		finL1.setTextureSize(128, 64);
		finL1.mirror = true;
		setRotation(finL1, 0F, 0F, 0F);
		finL3 = new ModelRenderer(this, 116, 60);
		finL3.addBox(2.8F, -1F, -1.7F, 5, 3, 1);
		finL3.setRotationPoint(0F, 0F, 0F);
		finL3.setTextureSize(128, 64);
		finL3.mirror = true;
		setRotation(finL3, 0F, 0F, 0F);
		finL6 = new ModelRenderer(this, 118, 60);
		finL6.addBox(3.6F, -1F, 2.5F, 4, 3, 1);
		finL6.setRotationPoint(0F, 0F, 0F);
		finL6.setTextureSize(128, 64);
		finL6.mirror = true;
		setRotation(finL6, 0F, 0F, 0F);
		finL9 = new ModelRenderer(this, 124, 60);
		finL9.addBox(10.2F, -1F, 3F, 1, 3, 1);
		finL9.setRotationPoint(0F, 0F, 0F);
		finL9.setTextureSize(128, 64);
		finL9.mirror = true;
		setRotation(finL9, 0F, 0F, 0F);
		finL10 = new ModelRenderer(this, 110, 59);
		finL10.addBox(3F, -1F, 1.2F, 7, 3, 2);
		finL10.setRotationPoint(0F, 0F, 0F);
		finL10.setTextureSize(128, 64);
		finL10.mirror = true;
		setRotation(finL10, 0F, 0F, 0F);
		finL11 = new ModelRenderer(this, 112, 60);
		finL11.addBox(2.8F, -1.5F, -2F, 5, 1, 3);
		finL11.setRotationPoint(0F, 0F, 1F);
		finL11.setTextureSize(128, 64);
		finL11.mirror = true;
		setRotation(finL11, 0F, 0F, 0F);
		body = new ModelRenderer(this, "body");
		body.setRotationPoint(0F, 20F, 4F);
		setRotation(body, 0F, 0F, 0F);
		body.mirror = true;
		body1 = new ModelRenderer(this, 78, 49);
		body1.addBox(-7.5F, -5F, -9F, 15, 5, 10);
		body1.setRotationPoint(0F, 0F, 0F);
		body1.setTextureSize(128, 64);
		body1.mirror = true;
		setRotation(body1, 0F, 0F, 0F);
		body3 = new ModelRenderer(this, 76, 49);
		body3.addBox(-8F, -1F, -9F, 16, 5, 10);
		body3.setRotationPoint(0F, 0F, 0F);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 0F, 0F, 0F);
		shell2 = new ModelRenderer(this, 120, 0);
		shell2.addBox(7F, -5.5F, -6.2F, 2, 3, 2);
		shell2.setRotationPoint(0F, 0F, 0F);
		shell2.setTextureSize(128, 64);
		shell2.mirror = true;
		setRotation(shell2, 0F, 0F, 0F);
		shell4 = new ModelRenderer(this, 120, 0);
		shell4.addBox(7F, -2.1F, -2.9F, 2, 2, 2);
		shell4.setRotationPoint(0F, 0F, 0F);
		shell4.setTextureSize(128, 64);
		shell4.mirror = true;
		setRotation(shell4, 0F, 0F, 0F);
		shell10 = new ModelRenderer(this, 120, 0);
		shell10.addBox(-9F, -5.5F, -6.2F, 2, 3, 2);
		shell10.setRotationPoint(0F, 0F, 0F);
		shell10.setTextureSize(128, 64);
		shell10.mirror = true;
		setRotation(shell10, 0F, 0F, 0F);
		shell12 = new ModelRenderer(this, 120, 0);
		shell12.addBox(-9F, -2.1F, -2.9F, 2, 2, 2);
		shell12.setRotationPoint(0F, 0F, 0F);
		shell12.setTextureSize(128, 64);
		shell12.mirror = true;
		setRotation(shell12, 0F, 0F, 0F);
		shell21 = new ModelRenderer(this, 112, 0);
		shell21.addBox(6.5F, -6F, -5F, 2, 4, 6);
		shell21.setRotationPoint(0F, 0F, 0F);
		shell21.setTextureSize(128, 64);
		shell21.mirror = true;
		setRotation(shell21, 0F, 0F, 0F);
		shell22 = new ModelRenderer(this, 112, 0);
		shell22.addBox(-8.5F, -6F, -5F, 2, 4, 6);
		shell22.setRotationPoint(0F, 0F, 0F);
		shell22.setTextureSize(128, 64);
		shell22.mirror = true;
		setRotation(shell22, 0F, 0F, 0F);
		spike1 = new ModelRenderer(this, 120, 0);
		spike1.addBox(-1F, -11F, -2.5F, 2, 3, 2);
		spike1.setRotationPoint(0F, 0F, 0F);
		spike1.setTextureSize(128, 64);
		spike1.mirror = true;
		setRotation(spike1, 0F, 0F, 0F);
		neck = new ModelRenderer(this, "neck");
		neck.setRotationPoint(0.5F, 15F, -4.5F);
		setRotation(neck, 0F, 0F, 0F);
		neck.mirror = true;
		neck1 = new ModelRenderer(this, 109, 54);
		neck1.addBox(-2.5F, -16.5F, 1.5F, 4, 3, 5);
		neck1.setRotationPoint(0F, 0F, 0F);
		neck1.setTextureSize(128, 64);
		neck1.mirror = true;
		setRotation(neck1, 0F, 0F, 0F);
		chest3 = new ModelRenderer(this, 0, 19);
		chest3.addBox(-3.5F, 0F, -4.5F, 6, 9, 4);
		chest3.setRotationPoint(0F, 0F, 0F);
		chest3.setTextureSize(128, 64);
		chest3.mirror = true;
		setRotation(chest3, 0F, 0F, 0F);
		head = new ModelRenderer(this, "head");
		head.setRotationPoint(0.5F, -13F, 4.5F);
		setRotation(head, 0F, 0F, 0F);
		head.mirror = true;
		head1 = new ModelRenderer(this, 0, 32);
		head1.addBox(-4.5F, -10.5F, -4F, 7, 7, 5);
		head1.setRotationPoint(0F, 0F, 0F);
		head1.setTextureSize(128, 64);
		head1.mirror = true;
		setRotation(head1, 0F, 0F, 0F);
		head2 = new ModelRenderer(this, 112, 56);
		head2.addBox(-4.5F, -11.3F, -0.5F, 7, 7, 1);
		head2.setRotationPoint(0F, 0F, 0F);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0F, 0F, 0F);
		head4 = new ModelRenderer(this, 112, 56);
		head4.addBox(-4.5F, -11.6F, -0.5F, 7, 7, 1);
		head4.setRotationPoint(0F, 0F, 0F);
		head4.setTextureSize(128, 64);
		head4.mirror = true;
		setRotation(head4, 0F, 0F, 0F);
		head5 = new ModelRenderer(this, 110, 55);
		head5.addBox(-4.5F, -10.5F, -1.5F, 7, 7, 2);
		head5.setRotationPoint(0F, 0F, 0F);
		head5.setTextureSize(128, 64);
		head5.mirror = true;
		setRotation(head5, 0F, 0F, 0F);
		head8 = new ModelRenderer(this, 106, 56);
		head8.addBox(-4F, -6.5F, -9F, 6, 3, 5);
		head8.setRotationPoint(0F, 0F, 0F);
		head8.setTextureSize(128, 64);
		head8.mirror = true;
		setRotation(head8, 0F, 0F, 0F);
		head10 = new ModelRenderer(this, 116, 56);
		head10.addBox(-4F, -6.5F, -8.5F, 1, 3, 5);
		head10.setRotationPoint(0F, 0F, 0F);
		head10.setTextureSize(128, 64);
		head10.mirror = true;
		setRotation(head10, 0F, 0F, 0F);
		chin1 = new ModelRenderer(this, 112, 28);
		chin1.addBox(-2.5F, -3.8F, -9F, 3, 1, 5);
		chin1.setRotationPoint(0F, 0F, 0F);
		chin1.setTextureSize(128, 64);
		chin1.mirror = true;
		setRotation(chin1, 0F, 0F, 0F);
		earL = new ModelRenderer(this, 116, 56);
		earL.addBox(1F, -14.2F, -3.5F, 2, 4, 4);
		earL.setRotationPoint(0F, 0F, 0F);
		earL.setTextureSize(128, 64);
		earL.mirror = true;
		setRotation(earL, 0F, 0F, 0F);
		earR = new ModelRenderer(this, 116, 56);
		earR.addBox(-5F, -14.2F, -3.5F, 2, 4, 4);
		earR.setRotationPoint(0F, 0F, 0F);
		earR.setTextureSize(128, 64);
		earR.mirror = true;
		setRotation(earR, 0F, 0F, 0F);
		eyes = new ModelRenderer(this, 0, 0);
		eyes.addBox(-4F, -10.5F, -6F, 6, 4, 2);
		eyes.setRotationPoint(0F, 0F, 0F);
		eyes.setTextureSize(128, 64);
		eyes.mirror = true;
		setRotation(eyes, 0F, 0F, 0F);

		backfinL.addChild(backfinL8);
		backfinL.addChild(backfinL1);
		backfinL.addChild(backfinL2);
		backfinL.addChild(backfinL3);
		backfinL.addChild(backfinL4);
		backfinL.addChild(backfinL5);
		backfinL.addChild(backfinL6);
		backfinL.addChild(backfinL7);
		backfinL.addChild(backfinL9);

		backfinR.addChild(backfinR1);
		backfinR.addChild(backfinR2);
		backfinR.addChild(backfinR3);
		backfinR.addChild(backfinR4);
		backfinR.addChild(backfinR5);
		backfinR.addChild(backfinR6);
		backfinR.addChild(backfinR7);
		backfinR.addChild(backfinR8);
		backfinR.addChild(backfinR9);

		finR.addChild(finR1);
		finR.addChild(finR2);
		finR.addChild(finR3);
		finR.addChild(finR4);
		finR.addChild(finR5);
		finR.addChild(finR6);
		finR.addChild(finR7);
		finR.addChild(finR8);
		finR.addChild(finR9);
		finR.addChild(finR10);
		finR.addChild(finR11);

		finL.addChild(finL1);
		finL.addChild(finL2);
		finL.addChild(finL3);
		finL.addChild(finL4);
		finL.addChild(finL5);
		finL.addChild(finL6);
		finL.addChild(finL7);
		finL.addChild(finL8);
		finL.addChild(finL9);
		finL.addChild(finL10);
		finL.addChild(finL11);

		body.addChild(body1);
		body.addChild(body4);
		body.addChild(body2);
		body.addChild(body3);
		body.addChild(body5);
		body.addChild(spike1);
		body.addChild(spike2);
		body.addChild(spike3);
		body.addChild(spike4);
		body.addChild(spike5);
		body.addChild(spike6);
		body.addChild(spike7);
		body.addChild(shell1);
		body.addChild(shell2);
		body.addChild(shell3);
		body.addChild(shell4);
		body.addChild(shell5);
		body.addChild(shell6);
		body.addChild(shell7);
		body.addChild(shell8);
		body.addChild(shell9);
		body.addChild(shell10);
		body.addChild(shell11);
		body.addChild(shell12);
		body.addChild(shell13);
		body.addChild(shell14);
		body.addChild(shell15);
		body.addChild(shell16);
		body.addChild(shell17);
		body.addChild(shell18);
		body.addChild(shell19);
		body.addChild(shell20);
		body.addChild(shell21);
		body.addChild(shell22);
		body.addChild(shell23);
		body.addChild(shell24);

		neck.addChild(neck1);
		neck.addChild(neck2);
		neck.addChild(chest1);
		neck.addChild(chest2);
		neck.addChild(chest3);
		neck.addChild(neck3);
		neck.addChild(neck4);
		neck.addChild(head);

		head.addChild(head1);
		head.addChild(head2);
		head.addChild(head4);
		head.addChild(head5);
		head.addChild(head8);
		head.addChild(head10);
		head.addChild(head7);
		head.addChild(head9);
		head.addChild(chin1);
		head.addChild(chin2);
		head.addChild(chin3);
		head.addChild(horn);
		head.addChild(earL);
		head.addChild(earR);
		head.addChild(eyes);

		tail.addChild(tail1);
		tail.addChild(tail2);
		tail.addChild(tail3);
		tail.addChild(tail4);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		tail.render(f5);
		backfinR.render(f5);
		backfinL.render(f5);
		finR.render(f5);
		finL.render(f5);
		body.render(f5);
		neck.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		head.rotateAngleY = f3 / (180F / (float) Math.PI);
		head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}

}