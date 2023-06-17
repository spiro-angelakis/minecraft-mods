// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class haarp_missile_downward<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "haarp_missile_downward"), "main");
	private final ModelPart all;

	public haarp_missile_downward(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition body = all.addOrReplaceChild("body", CubeListBuilder.create().texOffs(46, 0).addBox(-1.5913F, -36.0F, -8.0F, 3.1826F, 36.5F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(101, 41).addBox(-8.0F, -36.0F, -1.5913F, 16.0F, 36.5F, 3.1826F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

		PartDefinition hexadecagon_r1 = body.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(85, 0).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 36.5F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(23, 38).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 36.5F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hexadecagon_r2 = body.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(101, 82).addBox(-8.0F, -20.0F, -1.5913F, 16.0F, 36.5F, 3.1826F, new CubeDeformation(0.0F))
		.texOffs(62, 54).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 36.5F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hexadecagon_r3 = body.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 36.5F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hexadecagon_r4 = body.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(0, 76).addBox(-1.5913F, -20.0F, -8.0F, 3.1826F, 36.5F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -16.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Thruster = all.addOrReplaceChild("Thruster", CubeListBuilder.create(), PartPose.offset(-4.0F, -2.0F, 2.0F));

		PartDefinition barrel1 = Thruster.addOrReplaceChild("barrel1", CubeListBuilder.create().texOffs(124, 32).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(124, 11).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, -2.125F));

		PartDefinition octagon_r1 = barrel1.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 130).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(114, 128).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel2 = Thruster.addOrReplaceChild("barrel2", CubeListBuilder.create().texOffs(85, 59).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(49, 92).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(10.375F, 0.0F, -1.75F));

		PartDefinition octagon_r2 = barrel2.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(64, 119).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(124, 23).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel3 = Thruster.addOrReplaceChild("barrel3", CubeListBuilder.create().texOffs(85, 41).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(69, 9).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, -8.375F));

		PartDefinition octagon_r3 = barrel3.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(0, 85).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(85, 50).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel4 = Thruster.addOrReplaceChild("barrel4", CubeListBuilder.create().texOffs(69, 0).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(62, 63).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 4.125F));

		PartDefinition octagon_r4 = barrel4.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(10, 65).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(0, 76).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition barrel5 = Thruster.addOrReplaceChild("barrel5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, -1.875F));

		PartDefinition octagon_r5 = barrel5.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(10, 54).addBox(-2.0F, -2.0F, -0.8284F, 4.0F, 4.0F, 1.6569F, new CubeDeformation(0.0F))
		.texOffs(62, 54).addBox(-0.8284F, -2.0F, -2.0F, 1.6569F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition TopBottom2 = Thruster.addOrReplaceChild("TopBottom2", CubeListBuilder.create().texOffs(139, 133).addBox(-1.6F, -3.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -2.0F, -2.0F));

		PartDefinition cube_r1 = TopBottom2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(39, 108).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r2 = TopBottom2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 113).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r3 = TopBottom2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(122, 105).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r4 = TopBottom2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(89, 123).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r5 = TopBottom2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(124, 0).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r6 = TopBottom2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(114, 128).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r7 = TopBottom2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 130).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r8 = TopBottom2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(25, 135).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition tip = all.addOrReplaceChild("tip", CubeListBuilder.create(), PartPose.offset(-0.2104F, -48.5F, -0.2991F));

		PartDefinition TopBottom = tip.addOrReplaceChild("TopBottom", CubeListBuilder.create().texOffs(125, 156).addBox(-1.6F, -3.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.2104F, 5.0F, 0.2991F));

		PartDefinition cube_r9 = TopBottom.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(140, 23).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -2.7925F, 0.0F));

		PartDefinition cube_r10 = TopBottom.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(140, 46).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -2.4435F, 0.0F));

		PartDefinition cube_r11 = TopBottom.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(50, 140).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition cube_r12 = TopBottom.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(140, 69).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r13 = TopBottom.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(75, 146).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -1.3963F, 0.0F));

		PartDefinition cube_r14 = TopBottom.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(147, 92).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r15 = TopBottom.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 151).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -0.6981F, 0.0F));

		PartDefinition cube_r16 = TopBottom.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 153).addBox(-1.5875F, -2.5F, -9.0F, 3.175F, 3.5F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0125F, -1.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition Top = tip.addOrReplaceChild("Top", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Top.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(33, 4).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.906F, 0.0F));

		PartDefinition cube_r18 = Top.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5918F, 0.0F));

		PartDefinition cube_r19 = Top.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 54).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.2951F, 0.0F));

		PartDefinition cube_r20 = Top.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 65).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0246F, 0.0F));

		PartDefinition cube_r21 = Top.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(39, 92).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

		PartDefinition cube_r22 = Top.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(39, 103).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.4573F, 0.0F));

		PartDefinition cube_r23 = Top.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(64, 108).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.1694F, 0.0F));

		PartDefinition cube_r24 = Top.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(39, 114).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8901F, 0.0F));

		PartDefinition cube_r25 = Top.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 116).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6283F, 0.0F));

		PartDefinition cube_r26 = Top.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(124, 0).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r27 = Top.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, -1.5F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.0805F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}