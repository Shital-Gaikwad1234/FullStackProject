import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeterInstallationComponent } from './meter-installation.component';

describe('MeterInstallationComponent', () => {
  let component: MeterInstallationComponent;
  let fixture: ComponentFixture<MeterInstallationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MeterInstallationComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MeterInstallationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
