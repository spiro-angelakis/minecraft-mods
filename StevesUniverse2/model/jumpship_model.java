// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class jumpship_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "jumpship_model"), "main");
	private final ModelPart all;

	public jumpship_model(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(0.0F, -20.0F, 2.0F));

		PartDefinition warp_ring = all.addOrReplaceChild("warp_ring", CubeListBuilder.create().texOffs(262, 96).addBox(-26.5097F, 63.0F, -32.0F, 53.0193F, 1.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(0, 256).addBox(-26.5097F, -64.0F, -32.0F, 53.0193F, 1.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(366, 374).addBox(63.0F, -26.5097F, -32.0F, 1.0F, 53.0193F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(170, 321).addBox(-64.0F, -26.5097F, -32.0F, 1.0F, 53.0193F, 64.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -23.0F, 0.0F));

		PartDefinition octagon_r1 = warp_ring.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(300, 321).addBox(-64.0F, -26.5097F, -32.0F, 1.0F, 53.0193F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(0, 404).addBox(63.0F, -26.5097F, -32.0F, 1.0F, 53.0193F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(234, 256).addBox(-26.5097F, -64.0F, -32.0F, 53.0193F, 1.0F, 64.0F, new CubeDeformation(0.0F))
		.texOffs(262, 161).addBox(-26.5097F, 63.0F, -32.0F, 53.0193F, 1.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition ship = all.addOrReplaceChild("ship", CubeListBuilder.create().texOffs(0, 0).addBox(-27.0F, -30.0F, -53.0F, 57.0F, 30.0F, 100.0F, new CubeDeformation(0.0F))
		.texOffs(0, 321).addBox(-31.0F, -30.0F, 47.0F, 66.0F, 64.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 130).addBox(-12.0F, 0.0F, -28.0F, 28.0F, 30.0F, 75.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -17.0F, -8.0F));

		PartDefinition cube_r1 = ship.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(266, 256).addBox(-1.0F, -56.0F, -12.0F, 5.0F, 52.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.25F, -47.0F, 1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r2 = ship.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(131, 159).addBox(-3.0F, -25.0F, -14.0F, 9.0F, 21.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -15.25F, -42.0F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r3 = ship.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(366, 321).addBox(-28.0F, -25.0F, -14.0F, 59.0F, 21.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.25F, -42.0F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r4 = ship.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(345, 0).addBox(-27.0F, -25.0F, -14.0F, 57.0F, 38.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, -27.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r5 = ship.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(131, 160).addBox(-12.0F, -21.0F, -28.0F, 28.0F, 21.0F, 75.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 21.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r6 = ship.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(214, 0).addBox(-12.0F, -21.0F, -28.0F, 28.0F, 21.0F, 75.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 20.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition thrusters = all.addOrReplaceChild("thrusters", CubeListBuilder.create(), PartPose.offset(0.0F, 44.0F, -33.0F));

		PartDefinition thruster = thrusters.addOrReplaceChild("thruster", CubeListBuilder.create().texOffs(66, 404).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(170, 285).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, -43.0F, 98.0F));

		PartDefinition octagon_r2 = thruster.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(236, 321).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(404, 226).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster_cap = thruster.addOrReplaceChild("thruster_cap", CubeListBuilder.create().texOffs(262, 209).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(84, 235).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(272, 350).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(236, 350).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition octagon_r3 = thruster_cap.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(254, 350).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(290, 350).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(58, 244).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(262, 226).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster4 = thrusters.addOrReplaceChild("thruster4", CubeListBuilder.create().texOffs(0, 130).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(19.0F, -43.0F, 98.0F));

		PartDefinition octagon_r4 = thruster4.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(0, 29).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(214, 0).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster_cap4 = thruster4.addOrReplaceChild("thruster_cap4", CubeListBuilder.create().texOffs(160, 159).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 87).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 283).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(50, 170).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition octagon_r5 = thruster_cap4.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(256, 48).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(18, 283).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(42, 87).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 178).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster3 = thrusters.addOrReplaceChild("thruster3", CubeListBuilder.create().texOffs(0, 235).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, -75.0F, 98.0F));

		PartDefinition octagon_r6 = thruster3.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(131, 130).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(262, 161).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster_cap3 = thruster3.addOrReplaceChild("thruster_cap3", CubeListBuilder.create().texOffs(131, 192).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(163, 183).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(307, 122).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(36, 283).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition octagon_r7 = thruster_cap3.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(46, 296).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(332, 321).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 187).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 196).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster2 = thrusters.addOrReplaceChild("thruster2", CubeListBuilder.create().texOffs(170, 321).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(227, 130).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(19.0F, -75.0F, 98.0F));

		PartDefinition octagon_r8 = thruster2.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(170, 256).addBox(-16.0F, -6.6274F, -8.0F, 32.0F, 13.2548F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 404).addBox(-6.6274F, -16.0F, -8.0F, 13.2548F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition thruster_cap2 = thruster2.addOrReplaceChild("thruster_cap2", CubeListBuilder.create().texOffs(214, 66).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(214, 48).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(342, 334).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(337, 226).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition octagon_r9 = thruster_cap2.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(324, 342).addBox(-16.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(345, 0).addBox(15.0F, -6.6274F, -4.0F, 1.0F, 13.2548F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(214, 57).addBox(-6.6274F, -16.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(42, 235).addBox(-6.6274F, 15.0F, -4.0F, 13.2548F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 600, 600);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}