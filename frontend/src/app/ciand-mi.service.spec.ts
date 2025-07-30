import { TestBed } from '@angular/core/testing';

import { CIandMIService } from './ciand-mi.service';

describe('CIandMIService', () => {
  let service: CIandMIService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CIandMIService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
